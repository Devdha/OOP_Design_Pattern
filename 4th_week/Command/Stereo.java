public class Stereo { 
    String location = "";
    public Stereo(String location) { this.location = location;
    }
    public void on() {
    System.out.println(location + " Stereo is on");
    }
    public void off() {
    System.out.println(location + " Stereo is off");
} 
}