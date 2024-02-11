# Bridge

## Description

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

The abstraction defines the high-level control logic, while the implementation provides the low-level details. By decoupling the abstraction from its implementation, the Bridge pattern allows changes to be made in one without affecting the other, promoting flexibility and ease of maintenance.

## Example

In this example, we have shapes (e.g., circle, square) and colors (e.g., red, blue). We use the Bridge pattern to separate the abstraction of shapes from the implementation of colors, allowing us to combine shapes with different colors easily.

The `Shape` abstraction class defines a method `draw()` which delegates the drawing to the `Color`. Concrete implementations of shapes (`Circle` and `Square`) override the `draw()` method to draw shapes with the specified color.

The `Color` interface defines a method `fill()` for filling shapes with color. Concrete implementations of colors (`Red` and `Blue`) provide specific color implementations.

In the client code, we create instances of shapes with different colors and draw them. The Bridge pattern allows us to combine shapes with different colors easily, providing flexibility and decoupling between the abstraction and implementation.
