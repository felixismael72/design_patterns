# Proxy

## Description

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## Example

In this example, we'll illustrate the Proxy pattern using a digital library system where users can access and download books. Some books in the library are very large and take a long time to download. To improve user experience and reduce server load, we'll implement a proxy system.

### Implementation

- **BookService**: This is the interface that defines the operations for accessing books.
  
- **RealBookService**: This is the real subject class that implements the `BookService` interface. It represents the actual book service that fetches books from the library server.
  
- **CachedBookService**: This is the proxy class that also implements the `BookService` interface. It acts as a proxy for accessing book objects and maintains a cache of recently accessed books to provide faster access.
  
- **LibraryUser**: This is the client class that represents a user of the digital library system. Users interact with the `BookService` interface to request and read books.

### Usage

- Users of the digital library system can request books by their identifiers through the `BookService` interface. Depending on the implementation (either real or cached), the proxy controls access to the original object (real book service) and performs additional actions such as caching and logging.

This example demonstrates how the Proxy pattern can be used to control access to expensive resources (such as large book objects) and provide additional functionalities like caching for better performance and user experience.
