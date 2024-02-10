package creational.abstract_factory;

public class UsernamePasswordAuthenticationHandler implements AuthenticationHandler {
  @Override
  public void authenticate(String username, String password) {
    System.out.println("Username and password authentication for user: " + username);
  }
}
