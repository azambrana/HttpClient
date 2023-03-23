package com.oop.httpclient;

public class POSTRequest extends HttpRequest {
    private String payload;
    private QueryParams queryParams;

    public POSTRequest(URL requestURL, String httpVersion, String body) {
        super(requestURL, httpVersion, "POST", body);
        this.queryParams = new QueryParams();
    }

    public POSTRequest(URL requestURL, String body) {
        this(requestURL, "HTTP/1.1", body);
        // super(requestURL, "HTTP/1.1", "POST", body);
        this.queryParams = new QueryParams();
    }
}
