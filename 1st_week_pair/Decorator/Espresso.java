public abstract class Espresso {

  String productName;

  public String toString() {
    return '[' + productName + ']';
  }

  public void print() {
    System.out.println('(' + productName + ')');
    System.out.println(this.toString());
    System.out.println();
  }
}