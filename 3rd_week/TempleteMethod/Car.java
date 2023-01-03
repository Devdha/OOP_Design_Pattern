public abstract class Car {
  public final void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public final void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  public abstract void drive();

  public abstract void stop();

  public void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }
}