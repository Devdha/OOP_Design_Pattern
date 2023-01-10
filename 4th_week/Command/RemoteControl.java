import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> onCommands;
    private ArrayList<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < onCommands.size(); i++) {
            str += (i + ", " + onCommands.get(i).getClass().getName() + ", " + offCommands.get(i).getClass().getName()
                    + "\n");
        }
        return str;
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands.add(index, onCommand);
        offCommands.add(index, offCommand);
    }

    public void onButtonWasPushed(int index) {
        onCommands.get(index).execute();
    }

    public void offButtonWasPushed(int index) {
        offCommands.get(index).execute();
    }
}