public class MainBoard {
  public static void main(String[] args) {
    Player player = new Player();
    player.play();
    player.upgradeLevel(new AdvancedLevel());
    player.play();
    player.upgradeLevel(new SuperLevel());
    player.play();
  }
}