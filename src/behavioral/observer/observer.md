# Observer

## Description

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

## Example

Consider a text editor application where users can open and modify documents. We'll implement the Observer pattern to notify various listeners (such as email notification listeners and log open listeners) whenever a document is opened or modified.

### Implementation

- **Editor**: This class represents the text editor where users can open and modify documents. It maintains a list of event listeners and provides methods to register and notify listeners.

- **EventListener**: This interface defines the contract for event listeners. Concrete implementations of event listeners will receive notifications when specific events occur.

- **EmailNotificationListener**: This class is a concrete implementation of the `EventListener` interface. It sends email notifications when a document is opened.

- **LogOpenListener**: This class is another concrete implementation of the `EventListener` interface. It logs document openings to a log file.

### Usage

- Users interact with the text editor by opening and modifying documents.

- The text editor notifies registered event listeners (such as email notification listeners and log open listeners) whenever a document is opened.

- Email notification listeners receive notifications and send email notifications to specified recipients.

- Log open listeners receive notifications and log document openings to a log file.

This example demonstrates how the Observer pattern can be used to implement a subscription mechanism for notifying multiple objects about events in a text editor application, enabling decoupled and extensible event handling.
