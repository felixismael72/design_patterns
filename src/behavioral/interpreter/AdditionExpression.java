package behavioral.interpreter;

public class AdditionExpression implements MathExpression {
  private MathExpression left;
  private MathExpression right;

  public AdditionExpression(MathExpression left, MathExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(MathInterpreterContext context) {
    return left.interpret(context) + right.interpret(context);
  }
}
