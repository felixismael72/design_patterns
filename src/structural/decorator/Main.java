package structural.decorator;

public class Main {
  public static void main(String[] args) {
    RequestProcessor basicProcessor = new BasicRequestProcessor();
    RequestProcessor processorWithLogger = new RequestLogger(basicProcessor);
    RequestProcessor processorWithLoggerAndCompressor = new RequestCompressor(processorWithLogger);

    processorWithLoggerAndCompressor.processRequest("GET /api/users");
    processorWithLoggerAndCompressor.processRequest("POST /api/products");
  }
}
