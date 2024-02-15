# Visitor

## Description

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate. It allows adding new operations to existing object structures without modifying those structures.

## Example

Consider a visitor management system in a building where security personnel need to perform different actions or checks on various types of visitors, such as employees, guests, and delivery personnel. We'll implement the Visitor pattern to allow security personnel to handle each type of visitor independently, performing specific actions or checks as needed.

### Entities

- **Visitor**: This interface defines a visitor interface with methods for handling different types of visitors, such as employees, guests, and delivery personnel.

- **SecurityPersonnel**: This class represents security personnel who visit various areas of the building to perform checks on visitors. It implements the Visitor interface and provides concrete implementations for handling different types of visitors.

- **Employee**: This class represents an employee visiting the building. It implements the accept method to allow security personnel to perform security checks on employees.

- **Guest**: This class represents a guest visiting the building. It also implements the accept method to allow security personnel to perform security checks on guests.

- **DeliveryPersonnel**: This class represents delivery personnel visiting the building to deliver packages. Like employees and guests, it implements the accept method for security checks.

### Usage

- When a visitor arrives at the building, the visitor object is passed to the security personnel.
- Security personnel use the accept method of the visitor to perform security checks specific to the visitor type.
- Depending on the type of visitor, security personnel may perform identity verification, check for authorized access, or inspect packages.

This example demonstrates how the Visitor pattern can be used in a real-world scenario to separate algorithms from the objects they operate on, allowing for flexible and extensible handling of different types of visitors in a visitor management system.
