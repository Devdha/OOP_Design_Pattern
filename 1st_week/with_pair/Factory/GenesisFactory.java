public class GenesisFactory extends CarFactory {
  @Override
  public Car createCar() {
    return new Genesis();
  }
}