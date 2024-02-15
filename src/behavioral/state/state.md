# State

## Description

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

## Example

Consider a media player application that can be in different states such as locked, ready, or playing. We'll implement the State pattern to represent each state as a separate object and allow the media player to transition between states based on user interactions.

### Implementation

- **Player**: This class represents the media player and maintains a reference to the current state. It provides methods to change the state and delegate behavior to the current state object.

- **State**: This interface defines the contract for different states of the media player. Concrete state classes implement this interface and provide behavior specific to each state.

- **LockedState**: This class is a concrete implementation of the `State` interface. It represents the state of the media player when it's locked, restricting user interactions.

- **ReadyState**: This class is another concrete implementation of the `State` interface. It represents the state of the media player when it's ready to play content.

- **PlayingState**: This class is yet another concrete implementation of the `State` interface. It represents the state of the media player when it's actively playing content.

### Usage

- The media player starts in the locked state, where user interactions are restricted.

- Upon user input, such as unlocking the player or loading media content, the media player transitions to different states (e.g., ready or playing) based on the current state and user actions.

- Each state object encapsulates behavior specific to that state, allowing the media player to adapt its behavior dynamically based on its internal state.

This example demonstrates how the State pattern can be used to represent different states of a media player and enable seamless transitions between states, leading to more flexible and maintainable code.
