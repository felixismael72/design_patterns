package creational.prototype;

public class CSVReport extends FileReport {
  public CSVReport() {
    content.append("CSV REPORT");
    this.reportName = "report.csv";
  }

  @Override
  public void generate() {
    System.out.println("Generating csv report...");
    createFileIfNeeded();
    writeContentToReport();
  }
}
