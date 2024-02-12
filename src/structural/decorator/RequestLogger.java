package structural.decorator;

public class RequestLogger implements RequestProcessor {
  private RequestProcessor requestProcessor;

  public RequestLogger(RequestProcessor requestProcessor) {
    this.requestProcessor = requestProcessor;
  }

  @Override
  public void processRequest(String request) {
    logRequest(request);
    requestProcessor.processRequest(request);
  }

  private void logRequest(String request) {
    System.out.println("Logging request: " + request);
  }
}
