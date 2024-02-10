package creational.abstract_factory;

public class SimpleTokenGenerator implements TokenGenerator {
  @Override
  public String generateToken() {
    return "SimpleToken";
  }
}
