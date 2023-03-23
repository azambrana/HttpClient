package com.oop.httpclient;

public class GETRequest extends HttpRequest{
    private QueryParams queryParams;

    public GETRequest(URL requestURL, String httpVersion, String method, String body) {
        super(requestURL, httpVersion, method, body);
        this.queryParams = new QueryParams();
    }
}
