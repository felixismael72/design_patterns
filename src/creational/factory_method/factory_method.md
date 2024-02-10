# Factory Method

## Description

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Example

In this example, we're going to have a Logger as the product that needs to be created. We'll define a `Logger` interface with a `log` method, along with concrete implementations such as `ConsoleLogger` and `FileLogger`. 

We'll also create a `LoggerFactory` abstract class with a factory method `createLogger()`, which subclasses will override to provide specific implementations of `Logger`. Concrete factories like `ConsoleLoggerFactory` and `FileLoggerFactory` will be responsible for creating instances of `ConsoleLogger` and `FileLogger`, respectively.

The client code will use the factory method to obtain a logger instance without needing to know the specific implementation details. This promotes flexibility and extensibility, allowing for easy addition of new logger implementations in the future.
