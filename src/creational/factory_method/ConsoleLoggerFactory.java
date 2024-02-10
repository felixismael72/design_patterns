package creational.factory_method;

public class ConsoleLoggerFactory extends LoggerFactory {
  @Override
  public Logger createLogger() {
    return new ConsoleLogger();
  }
}
