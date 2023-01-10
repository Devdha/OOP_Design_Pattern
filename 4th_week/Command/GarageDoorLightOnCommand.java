public class GarageDoorLightOnCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorLightOnCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.lightOn();
  }

}