public class Decorator extends Coffee {
  protected Coffee coffee;

  public Decorator(Coffee coffee) {
    this.coffee = coffee;
    name = this.coffee.name;
  }
}