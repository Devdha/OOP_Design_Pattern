public class SonataFactory extends CarFactory {

  @Override
  public Car createCar() {
    return new Sonata();
  }
}