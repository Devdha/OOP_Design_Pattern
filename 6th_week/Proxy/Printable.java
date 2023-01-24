public interface Printable {

  public abstract void setPrinterName(String name); // 이름의 설정

  public abstract String getPrinterName();

  public abstract void print(String string);
}