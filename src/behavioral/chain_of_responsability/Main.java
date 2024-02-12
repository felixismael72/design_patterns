package behavioral.chain_of_responsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private static Server server;

  public static void main(String[] args) throws IOException {
    init();

    boolean success;
    do {
      System.out.print("Enter email: ");
      String email = reader.readLine();
      System.out.print("Input password: ");
      String password = reader.readLine();
      success = server.logIn(email, password);
    } while (!success);
  }

  private static void init() {
    server = new Server();
    server.register("admin@example.com", "admin_pass");
    server.register("user@example.com", "user_pass");

    Middleware middleware = Middleware.link(
        new ThrottlingMiddleware(2),
        new UserExistsMiddleware(server),
        new RoleCheckMiddleware());

    server.setMiddleware(middleware);
  }
}
