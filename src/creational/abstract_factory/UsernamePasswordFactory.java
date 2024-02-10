package creational.abstract_factory;

public class UsernamePasswordFactory implements SecurityFactory {
  @Override
  public AuthenticationHandler createAuthenticationHandler() {
    return new UsernamePasswordAuthenticationHandler();
  }

  @Override
  public TokenGenerator createTokenGenerator() {
    return new SimpleTokenGenerator();
  }
}
