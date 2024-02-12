# Flyweight

## Description

Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

## Example

In the example provided by Refactoring Guru, the Flyweight pattern is applied to optimize the memory usage of a tree structure in a computer game.

### Implementation

- **TreeType**: This is the flyweight class that represents the intrinsic state of a tree, such as its type (e.g., oak, pine) and texture.
- **TreeFactory**: This acts as a flyweight factory, managing a pool of unique tree types. It ensures that only one instance of each unique tree type is created and reused when needed.
- **Tree**: This is the context class that represents an individual tree object. It contains extrinsic state such as position (x, y) and age, as well as a reference to the shared tree type object.
- **Forest**: This is the client class that represents a collection of trees in the game world. It creates and manages individual tree objects using the TreeFactory.

### Usage

- In the game world, there can be many instances of trees with similar characteristics, such as the same type and texture. Instead of storing redundant data for each tree object, the Flyweight pattern allows the game to share common parts of state (tree type) among multiple tree objects.
- When a new tree needs to be created, the Forest class requests a tree type object from the TreeFactory. If a tree type with the same characteristics already exists in the pool, the factory returns the existing flyweight instead of creating a new one.
- Each tree object in the game world contains only its extrinsic state (position, age) and a reference to the shared flyweight object (tree type), resulting in reduced memory usage and improved performance.

This example demonstrates how the Flyweight pattern can be used to optimize memory usage in scenarios where many objects share common parts of state.
