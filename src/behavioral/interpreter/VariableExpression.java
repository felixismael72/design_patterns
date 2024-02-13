package behavioral.interpreter;

public class VariableExpression implements MathExpression {
  private String name;

  public VariableExpression(String name) {
    this.name = name;
  }

  @Override
  public int interpret(MathInterpreterContext context) {
    return context.getVariable(name);
  }
}
