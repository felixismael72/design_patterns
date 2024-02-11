package creational.builder;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    HttpRequest.Builder builder = new HttpRequest.Builder();
    HttpRequestDirector director = new HttpRequestDirector(builder);

    HttpRequest getRequest = director.constructGetRequest("https://api.example.com/users",
        Map.of("Authorization", "Bearer token123"));

    HttpRequest postRequest = director.constructPostRequest("https://api.example.com/users",
        Map.of("Content-Type", "application/json"),
        "{\"name\": \"John\", \"email\": \"john@example.com\"}");

    System.out.println("GET request: " + getRequest.getMethod() + " " + getRequest.getUrl());
    System.out.println("GET request headers: " + getRequest.getHeaders());
    System.out.println("POST request: " + postRequest.getMethod() + " " + postRequest.getUrl());
    System.out.println("POST request headers: " + postRequest.getHeaders());
    System.out.println("POST request body: " + postRequest.getBody());
  }
}
