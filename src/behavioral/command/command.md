# Command

## Description

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as method arguments, delay or queue a request’s execution, and support undoable operations.

## Example

In this example, we'll illustrate the Command pattern using a text editor application where users can perform various operations such as copying, cutting, pasting, and undoing text changes.

### Implementation

- **Command**: This is the interface that defines the common method `execute` for executing a command.

- **CopyCommand**: This is a concrete command class that implements the `Command` interface. It represents the command for copying text from the editor.

- **CutCommand**: This is another concrete command class that implements the `Command` interface. It represents the command for cutting text from the editor.

- **PasteCommand**: This is another concrete command class that implements the `Command` interface. It represents the command for pasting text into the editor.

- **UndoCommand**: This is another concrete command class that implements the `Command` interface. It represents the command for undoing the last text change in the editor.

- **Editor**: This is the invoker class that invokes commands to perform text editing operations. It maintains a history of executed commands, which allows for undoing operations.

### Usage

- Users interact with the text editor application by performing various text editing operations such as copying, cutting, pasting, and undoing changes.
  
- Each text editing operation is encapsulated as a command object, allowing for delayed or queued execution of commands.

- The text editor application maintains a history of executed commands, enabling users to undo the last text change if needed.

This example demonstrates how the Command pattern can be used to encapsulate and parameterize requests, allowing for flexible and extensible text editing operations in a text editor application.
