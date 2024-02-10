package creational.factory_method;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
  private final String logFileName = "log.txt";

  @Override
  public void log(String message) {
    createLogFileIfNeeded();
    writeMessageToLog(message);
  }

  private void createLogFileIfNeeded() {
    File logFile = new File(logFileName);
    if (!logFile.exists()) {
      try {
        logFile.createNewFile();
      } catch (IOException e) {
        System.err.println("Error creating log file: " + e.getMessage());
      }
    }
  }

  private void writeMessageToLog(String message) {
    try (FileWriter fileWriter = new FileWriter(logFileName)) {
      fileWriter.write(message);
    } catch (IOException e) {
      System.err.println("Error writing to log file: " + e.getMessage());
    }
  }
}
