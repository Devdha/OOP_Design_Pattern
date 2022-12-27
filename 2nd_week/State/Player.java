public class Player {
  PlayerLevel _level;

  public Player() {
    _level = new BeginnerLevel();
  }

  public PlayerLevel getLevel() {
    return this._level;
  }

  public void upgradeLevel(PlayerLevel level) {
    _level = level;
  }

  public void play() {
    _level.run();
    _level.jump();
    _level.turn();
    _level.go(3);
  }
}