# Decorator

## Description

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

## Example

In this example, we have a backend system that processes requests. We want to dynamically add additional functionality, such as logging and request compression, to the request processing without modifying the existing code. We use the Decorator pattern to achieve this.

- `RequestProcessor` is the component interface that declares the method for processing requests.
- `BasicRequestProcessor` is a concrete component implementing the basic request processing logic.
- `RequestLogger` and `RequestCompressor` are decorators that wrap around a `RequestProcessor` implementation and add logging and request compression functionality, respectively.
- The decorators add behaviors such as logging each request and compressing request data before delegating the processing to the wrapped `RequestProcessor`.
- In the client code, we create a basic request processor and then wrap it with decorators to dynamically add logging and compression functionality. This demonstrates the flexibility and power of the Decorator pattern in extending the behavior of objects at runtime.
