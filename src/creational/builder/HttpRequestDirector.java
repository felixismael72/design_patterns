package creational.builder;

import java.util.Map;

public class HttpRequestDirector {
  private final HttpRequest.Builder builder;

  public HttpRequestDirector(HttpRequest.Builder builder) {
    this.builder = builder;
  }

  public HttpRequest constructGetRequest(String url, Map<String, String> headers) {
    return builder.method("GET")
        .url(url)
        .headers(headers)
        .build();
  }

  public HttpRequest constructPostRequest(String url, Map<String, String> headers, String body) {
    return builder.method("POST")
        .url(url)
        .headers(headers)
        .body(body)
        .build();
  }
}
