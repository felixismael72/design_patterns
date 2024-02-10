package creational.factory_method;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, String> config = getConfig();

    String loggerType = config.get("logger");

    LoggerFactory factory;
    if ("console".equalsIgnoreCase(loggerType)) {
      factory = new ConsoleLoggerFactory();
    } else if ("file".equalsIgnoreCase(loggerType)) {
      factory = new FileLoggerFactory();
    } else {
      throw new IllegalArgumentException("Invalid logger type specified in configuration");
    }

    Logger logger = factory.getLogger();
    logger.log("This is a log message.");
  }

  private static Map<String, String> getConfig() {
    Map<String, String> config = new HashMap<>();
    config.put("logger", "file");
    return config;
  }
}
