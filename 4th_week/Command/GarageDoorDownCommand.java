public class GarageDoorDownCommand implements Command {
    GarageDoor door;
    public GarageDoorDownCommand(GarageDoor door) { 
        this.door = door;
    }
    public void execute() { 
        door.down();
    } 
}