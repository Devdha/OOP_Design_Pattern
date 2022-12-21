public class MochaSyrup extends Decorator {

  public MochaSyrup(Coffee coffee) {
    super(coffee);
    name += " Adding Mocha Syrup";
  }

  @Override
  public String toString() {
    return '[' + coffee.toString() + " + Adding Mocha Syrup]";
  }

}