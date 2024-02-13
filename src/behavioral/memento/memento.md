# Memento

## Description

Memento is a behavioral design pattern that allows making snapshots of an object’s state and restoring it in the future.

## Example

Consider a text editor application where users can write and edit documents. We'll implement the Memento pattern to allow users to undo and redo changes made to the document.

### Implementation

- **Document**: This class represents the document being edited in the text editor. It contains methods for modifying the document content and creating mementos to save the document state.

- **Memento**: This class represents a snapshot of the document's state at a specific point in time. It stores the content of the document.

- **Caretaker**: This class is responsible for managing the history of document states. It stores a list of mementos and provides methods for saving and retrieving mementos.

### Usage

- Users interact with the text editor by making changes to the document, such as typing text, deleting content, or formatting text.

- The text editor captures the state of the document at different points in time by creating mementos and storing them in the caretaker.

- Users can undo changes by restoring the document to a previous state using the caretaker's undo functionality.

- Users can redo changes that were undone by restoring the document to a subsequent state using the caretaker's redo functionality.

This example demonstrates how the Memento pattern can facilitate undo and redo functionality in a text editor application, allowing users to revert to previous document states with ease.
