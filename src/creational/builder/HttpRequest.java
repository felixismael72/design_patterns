package creational.builder;

import java.util.Map;

public class HttpRequest {
  private final String method;
  private final String url;
  private final Map<String, String> headers;
  private final String body;

  private HttpRequest(Builder builder) {
    this.method = builder.method;
    this.url = builder.url;
    this.headers = builder.headers;
    this.body = builder.body;
  }

  public String getMethod() {
    return method;
  }

  public String getUrl() {
    return url;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public String getBody() {
    return body;
  }

  public static class Builder {
    private String method;
    private String url;
    private Map<String, String> headers;
    private String body;

    public Builder method(String method) {
      this.method = method;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder headers(Map<String, String> headers) {
      this.headers = headers;
      return this;
    }

    public Builder body(String body) {
      this.body = body;
      return this;
    }

    public HttpRequest build() {
      return new HttpRequest(this);
    }
  }
}
