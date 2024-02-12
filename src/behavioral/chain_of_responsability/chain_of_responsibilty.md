# Chain of Responsibility

## Description

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

## Example

In this example, we'll illustrate the Chain of Responsibility pattern using a middleware system for handling HTTP requests in a web application.

### Implementation

- **Middleware**: This is the abstract base class for all middleware classes. It defines a method for handling HTTP requests and a reference to the next middleware in the chain.

- **ThrottlingMiddleware**: This is a concrete middleware class that checks whether the number of requests from a client exceeds a certain limit (throttling). If the limit is exceeded, it rejects the request. Otherwise, it passes the request to the next middleware in the chain.

- **UserExistsMiddleware**: This is another concrete middleware class that checks whether a user exists in the system. If the user exists, it allows the request to proceed to the next middleware. Otherwise, it rejects the request.

- **RoleCheckMiddleware**: This is another concrete middleware class that checks whether the user making the request has the necessary role (e.g., admin) to access certain resources. If the user has the required role, it allows the request to proceed. Otherwise, it rejects the request.

- **Server**: This is the client class that sends HTTP requests to the middleware chain for processing. It sets up the chain of middleware and sends requests to the first middleware in the chain.

### Usage

- The server sets up the chain of middleware and sends an HTTP request to the first middleware in the chain.
- Each middleware in the chain decides whether to process the request or to pass it to the next middleware based on its specific criteria.
- If a middleware rejects the request, the process stops, and the server receives a response indicating the request was denied. Otherwise, the request passes through all middleware and is eventually handled by the server.
