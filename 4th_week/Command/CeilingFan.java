public class CeilingFan { 
    String location = "";
    public CeilingFan(String location) { this.location = location;
    }
    public void on() {
    System.out.println(location + " CeilingFan is on");
    }
    public void off() {
    System.out.println(location + " CeilingFan is off");
} 
}