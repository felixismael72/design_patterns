# Iterator

## Description

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

## Example

In this example, we'll illustrate the Iterator pattern using a social network application where users can connect with friends and post updates. We'll implement an iterator to iterate over users' connections and demonstrate the usage of this iterator.

### Implementation

- **SocialNetworkIterator**: This is the iterator interface that defines methods for iterating over users' connections.

- **LinkedinIterator**: This is a concrete iterator class that implements the `SocialNetworkIterator` interface for iterating over connections in the LinkedIn social network.

- **FacebookIterator**: This is another concrete iterator class that implements the `SocialNetworkIterator` interface for iterating over connections in the Facebook social network.

- **SocialNetwork**: This is the aggregate class that contains a collection of users and provides methods for adding users and obtaining iterators for iterating over connections.

- **Facebook**: This is a concrete social network class that extends `SocialNetwork` and provides methods specific to the Facebook social network.

- **Linkedin**: This is another concrete social network class that extends `SocialNetwork` and provides methods specific to the LinkedIn social network.

- **User**: This class represents a user in the social network. It contains information about the user, such as their name and connections.

- **SocialSpammer**: This is a client class that demonstrates how to use the iterator to iterate over users' connections and perform actions such as sending spam messages.

### Usage

- Users can connect with friends and post updates on social networks such as Facebook and LinkedIn.

- The `SocialNetwork` class provides methods for adding users and obtaining iterators for iterating over connections in the social network.

- The concrete social network classes (`Facebook` and `Linkedin`) implement methods specific to their respective social networks.

- The `SocialSpammer` class demonstrates how to use the iterator to iterate over users' connections and perform actions such as sending spam messages.

This example illustrates how the Iterator pattern can be used to traverse elements of a collection (users' connections in this case) without exposing the underlying representation of the social network.
