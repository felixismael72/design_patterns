package behavioral.interpreter;

public class MultiplicationExpression implements MathExpression {
  private MathExpression left;
  private MathExpression right;

  public MultiplicationExpression(MathExpression left, MathExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(MathInterpreterContext context) {
    return left.interpret(context) * right.interpret(context);
  }
}
