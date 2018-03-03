package com.bot.configuration;

import org.json.JSONException;
import org.json.JSONObject;

public class HttpResult {
    public JSONObject constructMessage(String message) throws JSONException {
        JSONObject json = new JSONObject();
        try {
            json.put("result", message);
        } catch(Exception e) {
            json.put("result", ExceptionMessage.FAILED_CONSTRUCT_MESSAGE.toString());
        }

        return json;
    }

    public String extractMessage(JSONObject json) {
        try {
            return json.getString("result");
        } catch(Exception e) {
            return ExceptionMessage.FAILED_EXTRACT_MESSAGE.toString();
        }
    }
}
