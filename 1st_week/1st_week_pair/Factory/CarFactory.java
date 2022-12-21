public abstract class CarFactory {

  // operation
  public Car orderCar() {
    // order
    // create
    Car car = this.createCar();

    // check
    // deliver
    return car;
  }

  // factory method
  protected abstract Car createCar();
}