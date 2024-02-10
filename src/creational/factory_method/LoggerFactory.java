package creational.factory_method;

public abstract class LoggerFactory {
  abstract Logger createLogger();

  public Logger getLogger() {
    Logger logger = createLogger();
    return logger;
  }
}
