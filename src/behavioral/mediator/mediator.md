# Mediator

## Description

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

## Example

Consider a flight booking system where passengers can book flights and airlines manage their flight schedules. In this example, we'll implement the Mediator pattern to facilitate communication between passengers and airlines without direct coupling between them.

### Implementation

- **FlightMediator**: This interface defines methods for booking flights and querying flight schedules.

- **FlightBookingSystem**: This class implements the `FlightMediator` interface. It manages flight bookings and schedules by coordinating communication between passengers and airlines.

- **Passenger**: This class represents a passenger who wants to book a flight. Passengers interact with the `FlightBookingSystem` to book flights and query flight schedules.

- **Airline**: This class represents an airline that manages flight schedules. Airlines interact with the `FlightBookingSystem` to update flight schedules and respond to booking requests.

### Usage

- Passengers can request flight bookings and query flight schedules through the `FlightBookingSystem`.

- Airlines can update flight schedules and respond to booking requests received from the `FlightBookingSystem`.

- Passengers and airlines do not have direct dependencies on each other. They communicate through the mediator (`FlightBookingSystem`), which centralizes flight booking and scheduling operations.

This example demonstrates how the Mediator pattern can facilitate communication between different components of a system while minimizing direct dependencies between them.
