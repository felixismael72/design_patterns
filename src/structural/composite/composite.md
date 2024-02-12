# Composite

## Description

Composite is a structural design pattern that allows composing objects into a tree-like structure and work with it as if it was a singular object. It enables clients to treat individual objects and compositions of objects uniformly.

## Example

In this example, we have an organization structure for employees in a company. We use the Composite pattern to represent the hierarchical structure of departments and employees within those departments.

- `Employee` is the component interface that declares the method for showing employee details and calculating their salary.
- `Developer` is a leaf class representing individual developers with a specific salary.
- `Manager` is a composite class representing managers who can have subordinate employees (developers or other managers). It calculates the total salary of all subordinate employees.
- `Department` is another composite class representing departments within the organization. It contains managers and employees and calculates the total salary of all employees within the department.

In the client code, we create instances of developers, a manager, and a development department. We add employees to the department and demonstrate how to show the details of the department and calculate its total salary.
