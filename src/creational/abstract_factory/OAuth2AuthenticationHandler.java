package creational.abstract_factory;

public class OAuth2AuthenticationHandler implements AuthenticationHandler {
  @Override
  public void authenticate(String username, String password) {
    System.out.println("Oauth2 authentication for user: " + username);
  }
}
