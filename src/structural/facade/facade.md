# Facade

## Description

Facade is a structural design pattern that provides a simplified interface to a complex system of classes, libraries, or subsystems. It hides the complexities of the underlying system and provides a single entry point for interacting with it.

## Example

In this example, we'll illustrate the Facade pattern using a simplified scenario of ordering food at a restaurant.

### Implementation

- **RestaurantFacade**: This acts as the facade class, providing a simplified interface for ordering food. It encapsulates interactions with the menu, kitchen, and waiter subsystems.

- **Menu**: Represents the menu subsystem, which maintains a collection of available menu items.

- **Kitchen**: Represents the kitchen subsystem responsible for preparing food.

- **Waiter**: Represents the waiter subsystem responsible for serving food.

- **MenuItem**: Represents a menu item with a name and price.

### Usage

In the client code:

1. We create an instance of the `RestaurantFacade`.
2. We use the facade to place orders by specifying the item name. The facade handles the process of finding the item in the menu, preparing it in the kitchen, and serving it by the waiter.
3. If an item is not available in the menu, the facade gracefully handles the situation and notifies the customer.

This example demonstrates how the Facade pattern simplifies interactions with a complex system (restaurant operations) by providing a unified and simplified interface.
