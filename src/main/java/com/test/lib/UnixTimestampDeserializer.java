package com.test.lib;

import java.io.IOException;

import org.joda.time.DateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class UnixTimestampDeserializer extends JsonDeserializer<DateTime>{

	@Override
    public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String timestamp = jp.getText().trim();

        try {
            return new DateTime(Long.valueOf(timestamp + "000"));
        } catch (NumberFormatException e) {
        	System.out.println(e);
            return null;
        }
    }
}
