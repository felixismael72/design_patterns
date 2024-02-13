package behavioral.interpreter;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    MathExpression expression = new MultiplicationExpression(
        new SubtractionExpression(new VariableExpression("a"), new VariableExpression("b")),
        new DivisionExpression(new VariableExpression("c"), new VariableExpression("d")));

    Map<String, Integer> variableValues = Map.of("a", 5, "b", 2, "c", 8, "d", 4);
    MathInterpreterContext context = new MathInterpreterContext(variableValues);

    int result = expression.interpret(context);

    System.out.println("a = 5\nb = 2\nc = 8\nd = 4");
    System.out.println("(a - b) * (c / d) = " + result);
  }
}
