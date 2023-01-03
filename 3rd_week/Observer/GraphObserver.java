public class GraphObserver implements Observer {
  private int count;

  public void update(NumberGenerator generator) {
    count = generator.getNumber();

    // String output = "*".repeat(count);
    // System.out.println(output);

    System.out.println("GraphObserver : " + "*".repeat(count));
  }
}