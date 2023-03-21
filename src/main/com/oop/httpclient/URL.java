package com.oop.httpclient;

import java.util.logging.Logger;

public class URL {
    public static final String PATH_DELIMITER = "/";
    public static final String QUERY_DELIMITER = "?";
    public static final String FRAGMENT_DELIMITER = "#";
    private String schema;
    private String host;
    private int port;
    private String path;
    private String query;
    private String fragment;

    private Logger logger = Logger.getLogger(URL.class.getName());

    public URL(String schema, String host, int port, String path, String query, String fragment) {
        this(schema, host);

        setPort(port);
        setPath(path);
        setQuery(query);
        setFragment(fragment);
    }

    public URL(String schema, String host) {
        setSchema(schema);
        setHost(host);
        setPort(80);
        setPath("");
        setQuery("");
        setFragment("");
    }

    private void setHost(String host) {
        this.host = host;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    @Override
    public String toString() {
        return buildUrl();
    }

    /**
     * Builds the String representation of the URL containing all its components
     *
     * @return the String representation of the URL
     */
    public String buildUrl() {
        String queryComponent = (this.query.isEmpty()) ? "" : QUERY_DELIMITER + getQuery();
        String fragmentComponent = this.fragment.isEmpty() ? "" : FRAGMENT_DELIMITER + getFragment();
        String pathComponent = this.path.isEmpty() ? "" : PATH_DELIMITER + getPath();

        String url = this.schema + "://" + this.host + ":" + this.port +
                pathComponent +
                queryComponent +
                fragmentComponent;

        logger.info(url);

        return url;
    }

    public static void main(String[] args) {
        URL googleURL = new URL("https", "www.google.com");
        googleURL.buildUrl();

        URL url = new URL("http", "www.baidu.com", 8080, "index.html", "var=word", "anchorHomePage");
        url.buildUrl();
    }
}
