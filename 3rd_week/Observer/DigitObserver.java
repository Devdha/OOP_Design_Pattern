public class DigitObserver implements Observer {
  private int digit;

  public void update(NumberGenerator generator) {
    digit = generator.getNumber();
    System.out.println("DigitObserver : " + digit);
  }
}