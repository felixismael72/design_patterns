package creational.prototype;

public class Main {
  public static void main(String[] args) {
    FileReport pdfReport = FileReportRegistry.getReportPrototype("pdf");
    FileReport excelReport = FileReportRegistry.getReportPrototype("excel");
    FileReport csvReport = FileReportRegistry.getReportPrototype("csv");

    try {
      FileReport pdfClone = pdfReport.clone();
      FileReport excelClone = excelReport.clone();
      FileReport csvClone = csvReport.clone();

      pdfReport.generate();
      excelReport.generate();
      csvReport.generate();

      pdfClone.setReportName("report-2.pdf");
      pdfClone.setContent("\nNew line from clone");
      pdfClone.generate();
      excelClone.setReportName("report-2.xsl");
      excelClone.setContent("\nNew line from clone");
      excelClone.generate();
      csvClone.setReportName("report-2.csv");
      csvClone.setContent("\nNew line from clone");
      csvClone.generate();
    } catch (Exception e) {
      System.err.println("Error while cloning prototypes: " + e.getMessage());
    }

  }
}
