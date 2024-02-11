# Builder

## Description

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Example

In this example, we demonstrate the Builder pattern by implementing an HTTP request builder for a backend system. The `HttpRequest` class represents an HTTP request, while the `HttpRequest.Builder` class constructs the request in a step-by-step manner.

The `HttpRequest.Builder` class provides methods to set various attributes of the HTTP request, such as method, URL, headers, and body. It follows the fluent interface style, allowing method chaining for a concise construction process.

A `HttpRequestDirector` class acts as a director, orchestrating the construction process by providing methods to construct different types of HTTP requests (e.g., GET, POST) with various attributes.

The client code creates an instance of the builder (`HttpRequest.Builder`) and passes it to the director (`HttpRequestDirector`) to construct HTTP requests. This separation of concerns improves code readability and maintainability, as the client code only needs to provide necessary information to construct the request, without worrying about the internal construction process.


