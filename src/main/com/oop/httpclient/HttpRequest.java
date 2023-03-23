package com.oop.httpclient;

public class HttpRequest {
    private URL requestURL;
    private String httpVersion;
    private String method; // ToDo: implement using enum, supported methods: POST GET
    private String body;
    private Headers headers;

    public HttpRequest(URL requestURL, String httpVersion, String method, String body) {
        this.requestURL = requestURL;
        this.httpVersion = httpVersion;
        this.method = method;
        this.body = body;
    }
}
