package behavioral.interpreter;

public class SubtractionExpression implements MathExpression {
  private MathExpression left;
  private MathExpression right;

  public SubtractionExpression(MathExpression left, MathExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(MathInterpreterContext context) {
    return left.interpret(context) - right.interpret(context);
  }
}
