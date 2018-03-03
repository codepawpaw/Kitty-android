package com.bot.kitty;

import com.bot.configuration.ExceptionMessage;
import com.bot.configuration.HttpResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class HttpRequestManager {

    public static JSONObject getRequest(String url) throws JSONException {
        HttpGetRequest getRequest = new HttpGetRequest();
        try {
            String result = getRequest.execute(url).get();
            return new HttpResult().constructMessage(result);
        } catch (InterruptedException e) {
            return new HttpResult().constructMessage(ExceptionMessage.GET_FAILED.toString());
        } catch (ExecutionException e) {
            return new HttpResult().constructMessage(ExceptionMessage.GET_FAILED.toString());
        }
    }
}
