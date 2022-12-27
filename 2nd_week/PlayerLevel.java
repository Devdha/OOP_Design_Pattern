public abstract class PlayerLevel {
  public abstract void run();
  public abstract void jump();
  public abstract void turn();
  public abstract void showLevelMessage();
  final public void go(int meter) {
    System.out.println("앞으로 " + meter + "미터 갑니다.");
  }  
}