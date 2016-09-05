package com.test.rest.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.test.common.ResponseCode;
import com.test.entity.RestResponse;

@Component
public class RestClient {

	@Autowired
	RestClientConfig restClientConfig;
	
	private JacksonJsonProvider jacksonJsonProvider;

	public RestResponse callGet(String resource, Map<String, String> params){
	
			RestResponse restResponse = null;
			Response response = null;
            try {
            	
				// invoke service after setting necessary parameters
				ClientConfig clientConfig = new ClientConfig();
				jacksonJsonProvider = new JacksonJaxbJsonProvider().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

				Client client =  ClientBuilder.newClient(clientConfig).register(jacksonJsonProvider);
				//          client.property("Content-Type", MediaType.APPLICATION_FORM_URLENCODED);
				//          client.property("accept", MediaType.APPLICATION_JSON);
				WebTarget webTarget = client.target(getUrl(restClientConfig.getUrl(), restClientConfig.getVersion(), resource));
				
				Set<String> keys = params.keySet();
				Iterator<String> iterator = keys.iterator();
				while(iterator.hasNext()){
					String key = iterator.next();
					webTarget = webTarget.queryParam(key, params.get(key));
				}
				
				webTarget = webTarget.queryParam("appid", restClientConfig.getAppid());
 
				// invoke service
				//Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_FORM_URLENCODED).accept(MediaType.APPLICATION_JSON);
				Builder invocationBuilder = webTarget.request();
				invocationBuilder.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED);
			   invocationBuilder.header("Accept", MediaType.APPLICATION_JSON);
				
				response = invocationBuilder.get();
				
				restResponse = new RestResponse();
				restResponse.setResponse(response);
				restResponse.setResponseCode(ResponseCode.getResposeCodeByStatusCode(response.getStatus()));
				
				
				
			} 
            catch(ProcessingException ex){
            	restResponse.setResponse(response);
            	restResponse.setResponseCode(ResponseCode.PROCESSING_ERROR);
            }
            catch (Exception e) {
            	e.printStackTrace();
            	restResponse.setResponse(response);
            	restResponse.setResponseCode(ResponseCode.UNKNOWN_ERROR);	
			}
            return restResponse;
	}
	
	private String getUrl(String baseUrl, String version, String resource){
		return baseUrl + "/" + version +"/" + "/" + resource;
	}

	public RestClientConfig getRestClientConfig() {
		return restClientConfig;
	}

	public void setRestClientConfig(RestClientConfig restClientConfig) {
		this.restClientConfig = restClientConfig;
	}
	
	

}
