package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class FileReportRegistry {
  private static final Map<String, FileReport> prototypes = new HashMap<>();

  static {
    prototypes.put("pdf", new PDFReport());
    prototypes.put("excel", new ExcelReport());
    prototypes.put("csv", new CSVReport());
  }

  public static FileReport getReportPrototype(String type) {
    try {
      return prototypes.get(type).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }
}
