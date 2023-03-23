package com.oop.httpclient;

import java.util.HashMap;
import java.util.Map;

public class Headers {
    Map<String, String> headers;

    public Headers() {
        this.headers = new HashMap<String, String>();
    }

    public Headers(Map<String, String> headers) {
        this();
        this.headers = headers;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public String getHeader(String key) {
        return headers.get(key);
    }
}
