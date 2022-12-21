public abstract class Coffee {

  String name;

  public String toString() {
    return '[' + name + ']';
  }

  public void print() {
    System.out.println('(' + name + ')');
    System.out.println(this.toString());
    System.out.println();
  }
}