package creational.factory_method;

public class FileLoggerFactory extends LoggerFactory {
  @Override
  public Logger createLogger() {
    return new FileLogger();
  }
}
