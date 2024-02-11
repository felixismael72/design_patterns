# Prototype

## Description

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

## Example

In this example, we demonstrate the Prototype pattern in a backend system responsible for generating file reports. The system supports various file report formats such as PDF, Excel, and CSV, and each report may contain different types of content.

- We have an abstract `FileReport` class serving as the prototype for different types of reports. It defines the `generate()` method that subclasses must implement.
- Concrete report prototypes (`PDFReport`, `ExcelReport`, `CSVReport`) extend the `FileReport` class and provide implementations for generating specific report formats.
- The `FileReportRegistry` class acts as the client and provides a registry of report prototypes. It allows clients to obtain report prototypes by specifying the desired type.
- Client code retrieves report prototypes from the registry and clones them to generate specific reports. This way, we can dynamically create reports of different formats without directly instantiating concrete classes, demonstrating the flexibility of the Prototype pattern.
