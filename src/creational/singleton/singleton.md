# Singleton

## Description

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Example

In this example, we'll create a Singleton class called `AppConfigManager` to manage application configurations in a backend system. The class will ensure that only one instance of the configuration manager exists throughout the application, and it will provide a global access point to this instance.

The `AppConfigManager` class will have the following key components:
- A private static instance variable to hold the singleton instance.
- A private constructor to prevent instantiation from outside the class.
- A static `getInstance()` method to retrieve the singleton instance. This method is synchronized to ensure thread safety.
- A map to store application configurations.
- Methods to get and set configuration values.