package behavioral.interpreter;

import java.util.Map;

public class MathInterpreterContext {
  private Map<String, Integer> variables;

  public MathInterpreterContext(Map<String, Integer> variables) {
    this.variables = variables;
  }

  public int getVariable(String name) {
    return variables.get(name);
  }
}
