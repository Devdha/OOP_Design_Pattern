public class WhippedCream extends Decorator {

  public WhippedCream(Coffee coffee) {
    super(coffee);
    name += " Adding WhippedCream";
  }

  @Override
  public String toString() {
    return '[' + coffee.toString() + " + Adding WhippedCream]";
  }
}