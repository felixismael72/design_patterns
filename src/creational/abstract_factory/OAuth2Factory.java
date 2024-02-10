package creational.abstract_factory;

public class OAuth2Factory implements SecurityFactory {
  @Override
  public AuthenticationHandler createAuthenticationHandler() {
    return new OAuth2AuthenticationHandler();
  }

  @Override
  public TokenGenerator createTokenGenerator() {
    return new JWTTokenGenerator();
  }
}
