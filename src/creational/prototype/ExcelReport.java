package creational.prototype;

public class ExcelReport extends FileReport {
  public ExcelReport() {
    content.append("EXCEL REPORT");
    this.reportName = "report.xsl";
  }

  @Override
  public void generate() {
    System.out.println("Generating excel report...");
    createFileIfNeeded();
    writeContentToReport();
  }
}
