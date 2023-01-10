public class GarageDoorLightOffCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorLightOffCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.lightOff();
  }

}