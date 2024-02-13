package behavioral.interpreter;

public class DivisionExpression implements MathExpression {
  private MathExpression left;
  private MathExpression right;

  public DivisionExpression(MathExpression left, MathExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(MathInterpreterContext context) {
    return left.interpret(context) / right.interpret(context);
  }
}
