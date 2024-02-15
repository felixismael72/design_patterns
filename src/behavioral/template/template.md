# Template

## Description

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

## Example

Consider a recipe application where users can find and follow recipes for various dishes. We'll implement the Template Method pattern to provide a common structure for recipes while allowing subclasses to override specific steps to customize the cooking process for different dishes.

### Entities

- **Recipe**: This class represents a recipe for a dish. It defines a template method called `cook` that provides a common structure for cooking the dish. Specific steps in the cooking process, such as preparation, cooking, and serving, are implemented as abstract methods that subclasses must override.

- **PizzaRecipe**: This class is a concrete subclass of `Recipe` that implements the specific steps for cooking a pizza. It overrides the abstract methods to provide pizza-specific preparation, cooking, and serving steps.

- **PastaRecipe**: This class is another concrete subclass of `Recipe` that implements the specific steps for cooking pasta. It overrides the abstract methods to provide pasta-specific preparation, cooking, and serving steps.

### Usage

- Users select a recipe from the application, such as pizza or pasta.
- The application instantiates the corresponding recipe object based on the selected dish.
- Users follow the cooking process outlined in the recipe, which includes common steps such as preparation, cooking, and serving.
- Specific steps in the cooking process are customized for each dish, with subclasses providing implementations for dish-specific preparation, cooking, and serving.

This example demonstrates how the Template Method pattern can be used to provide a common structure for recipes while allowing subclasses to customize specific steps of the cooking process for different dishes.
