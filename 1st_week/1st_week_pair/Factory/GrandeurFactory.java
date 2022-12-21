public class GrandeurFactory extends CarFactory {
  @Override
  public Car createCar() {
    return new Grandeur();
  }
}