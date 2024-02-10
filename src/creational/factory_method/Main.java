package creational.factory_method;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    try {
      LoggerFactory factory = getLoggerFactory();
      Logger logger = factory.getLogger();
      logger.log("This is a log message.");
    } catch (Exception e) {
      System.err.println("Error getting logger factory: " + e.getMessage());
    }
  }

  private static LoggerFactory getLoggerFactory() {
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
    return factory;
  }

  private static Map<String, String> getConfig() {
    Map<String, String> config = new HashMap<>();
    config.put("logger", "file");
    return config;
  }
}
