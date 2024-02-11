package creational.prototype;

public class PDFReport extends FileReport {
  public PDFReport() {
    content.append("PDF REPORT");
    this.reportName = "report.pdf";
  }

  @Override
  public void generate() {
    System.out.println("Generating pdf report...");
    createFileIfNeeded();
    writeContentToReport();
  }
}
