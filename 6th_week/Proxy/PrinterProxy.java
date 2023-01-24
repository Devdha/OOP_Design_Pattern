public class PrinterProxy implements Printable {

  private String name;
  private Printer real;

  public PrinterProxy() {
  }

  public PrinterProxy(String name) {
    this.name = name;
  }

  public synchronized void setPrinterName(String name) {
    this.name = name;
    if (real != null) {
      real.setPrinterName(name);
    }
  }

  public String getPrinterName() {
    System.out.println("proxy : getPrinterName()");
    if (real != null) {
      return real.getPrinterName();
    }
    return name;
  }

  public void print(String string) {
    realize();
    // ToDo
    real.print(string);
  }

  private synchronized void realize() {
    if (real == null) {
      real = new Printer(name);
    }
  }
}