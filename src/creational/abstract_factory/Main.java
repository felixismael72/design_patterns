package creational.abstract_factory;

public class Main {
  private static final String username = "user123";
  private static final String password = "strong$_#password";

  public static void main(String[] args) {
    try {
      SecurityFactory factory = getSecurityFactory();
      AuthenticationHandler handler = factory.createAuthenticationHandler();
      TokenGenerator tokenGenerator = factory.createTokenGenerator();
      handler.authenticate(username, password);
      String token = tokenGenerator.generateToken();
      System.out.println("Generated Token: " + token);
    } catch (Exception e) {
      System.err.println("Error getting logger factory: " + e.getMessage());
    }
  }

  private static SecurityFactory getSecurityFactory() {
    String securityType = getSecurityType();
    SecurityFactory factory;
    if (securityType.equalsIgnoreCase("oauth2")) {
      factory = new OAuth2Factory();
    } else if (securityType.equalsIgnoreCase("username-password")) {
      factory = new UsernamePasswordFactory();
    } else {
      throw new IllegalArgumentException("Invalid security type provided in config");
    }
    return factory;
  }

  private static String getSecurityType() {
    return "oauth2";
  }
}
