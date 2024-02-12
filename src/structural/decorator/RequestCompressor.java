package structural.decorator;

public class RequestCompressor implements RequestProcessor {
  private RequestProcessor requestProcessor;

  public RequestCompressor(RequestProcessor requestProcessor) {
    this.requestProcessor = requestProcessor;
  }

  @Override
  public void processRequest(String request) {
    compressRequest(request);
    requestProcessor.processRequest(request);
  }

  private void compressRequest(String request) {
    System.out.println("Compressing request: " + request);
  }
}
