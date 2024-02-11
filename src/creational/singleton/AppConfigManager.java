package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class AppConfigManager {
  private static AppConfigManager instance;
  private Map<String, String> configurations;

  private AppConfigManager() {
    configurations = new HashMap<>();
    loadDefaultConfigurations();
  }

  public static synchronized AppConfigManager getInstance() {
    if (instance == null) {
      instance = new AppConfigManager();
    }
    return instance;
  }

  private void loadDefaultConfigurations() {
    configurations.put("server.host", "localhost");
    configurations.put("server.port", "8080");
  }

  public String getConfiguration(String key) {
    return configurations.get(key);
  }

  public void setConfiguration(String key, String value) {
    configurations.put(key, value);
  }
}
