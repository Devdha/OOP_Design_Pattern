public class DecoratorTest {
  public static void main(String[] args) {
    Coffee coffee = new Americano("kenya");
    coffee.print();
    coffee = new Milk(coffee);
    coffee.print();
    coffee = new WhippedCream(new MochaSyrup(coffee));
    coffee.print();
  }
}