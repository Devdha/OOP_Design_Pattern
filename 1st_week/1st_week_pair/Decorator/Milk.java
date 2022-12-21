public class Milk extends Decorator {

  public Milk(Coffee coffee) {
    super(coffee);
    name += " Adding Milk";
  }

  @Override
  public String toString() {
    return '[' + coffee.toString() + " + Adding Milk]";
  }

}