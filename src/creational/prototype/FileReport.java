package creational.prototype;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FileReport implements Cloneable {
  protected StringBuilder content = new StringBuilder();
  protected String reportName;

  public abstract void generate();

  @Override
  public FileReport clone() throws CloneNotSupportedException {
    return (FileReport) super.clone();
  }

  public String getContent() {
    return content.toString();
  }

  public void setContent(String content) {
    this.content.append(content);
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  protected void createFileIfNeeded() {
    File report = new File(reportName);
    if (!report.exists()) {
      try {
        report.createNewFile();
      } catch (IOException e) {
        System.err.println("Error while creating report: " + e.getMessage());
      }
    }
  }

  protected void writeContentToReport() {
    try (FileWriter writer = new FileWriter(reportName)) {
      writer.write(getContent());
    } catch (Exception e) {
      System.err.println("Error while writing to report: " + e.getMessage());
    }
  }
}
