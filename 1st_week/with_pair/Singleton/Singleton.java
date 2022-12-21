public class Singleton {

  private static class BillPughSingleton {
    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return BillPughSingleton.INSTANCE;
  }
}