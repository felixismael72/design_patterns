package creational.abstract_factory;

public class JWTTokenGenerator implements TokenGenerator {
  public String generateToken() {
    return "JWTToken";
  }
}
