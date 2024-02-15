# Strategy

## Description

Strategy is a behavioral design pattern that turns a set of behaviors into objects and makes them interchangeable inside the original context object.

## Example

Consider an e-commerce platform where customers can pay for their orders using different payment methods, such as PayPal or credit card. We'll implement the Strategy pattern to encapsulate each payment method as a separate strategy, allowing the platform to process payments seamlessly regardless of the chosen method.

### Entities

- **PayStrategy**: This interface defines the contract for payment strategies. Concrete implementations of payment strategies, such as `PayByPayPal` and `PayByCreditCard`, implement this interface and provide behavior specific to each payment method.

- **PayByPayPal**: This class is a concrete implementation of the `PayStrategy` interface. It encapsulates the behavior for processing payments using PayPal.

- **PayByCreditCard**: This class is another concrete implementation of the `PayStrategy` interface. It encapsulates the behavior for processing payments using a credit card.

- **CreditCard**: This class represents credit card information, including card number, expiration date, and CVV.

- **Order**: This class represents an order placed by a customer. It maintains information about the items in the order and the selected payment strategy.

### Usage

- Customers place orders on the e-commerce platform and select their preferred payment method, such as PayPal or credit card.

- The platform instantiates the corresponding payment strategy based on the chosen method and assigns it to the order.

- When customers proceed to pay for their orders, the platform executes the selected payment strategy, processing the payment using the appropriate method.

- Regardless of the selected payment method, the platform seamlessly processes payments using the assigned strategy, providing a consistent experience for customers.

This example demonstrates how the Strategy pattern can be used to encapsulate different payment methods as interchangeable strategies, enabling the e-commerce platform to process payments seamlessly regardless of the chosen method.
