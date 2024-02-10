package creational.abstract_factory;

public interface SecurityFactory {
  AuthenticationHandler createAuthenticationHandler();

  TokenGenerator createTokenGenerator();
}
