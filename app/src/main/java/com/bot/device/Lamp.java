package com.bot.device;

import com.bot.configuration.Configuration;
import com.bot.kitty.HttpRequestManager;

import org.json.JSONException;
import org.json.JSONObject;

public class Lamp {
    public static JSONObject turnOn() throws JSONException {
        return HttpRequestManager.getRequest(Configuration.endpoint + "/lampOn");
    }

    public static JSONObject turnOff() throws JSONException {
        return HttpRequestManager.getRequest(Configuration.endpoint + "/lampOff");
    }

    public static JSONObject status() throws JSONException {
        return  HttpRequestManager.getRequest(Configuration.endpoint + "/lampStatus");
    }
}
