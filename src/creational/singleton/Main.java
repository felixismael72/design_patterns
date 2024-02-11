package creational.singleton;

public class Main {
  public static void main(String[] args) {
    AppConfigManager configManager = AppConfigManager.getInstance();

    String serverHost = configManager.getConfiguration("server.host");
    String serverPort = configManager.getConfiguration("server.port");

    System.out.println("Server Host: " + serverHost);
    System.out.println("Server Port: " + serverPort);

    configManager.setConfiguration("server.port", "9080");
    System.out.println("Updated server port: " + configManager.getConfiguration("server.port"));
  }
}
