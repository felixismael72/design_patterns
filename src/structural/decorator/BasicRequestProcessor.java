package structural.decorator;

public class BasicRequestProcessor implements RequestProcessor {
  @Override
  public void processRequest(String request) {
    System.out.println("Processing request: " + request);
  }
}
