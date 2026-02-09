//Dan Rojas
//02 Feb 26
//mod 6.2

public class Fan {

    static void main() {

        Fan defaultFan = new Fan();
        System.out.println("\nNo-arg constructor use:");
        System.out.println(defaultFan);

        Fan customFan = new Fan(1, true, 10, "blue");
        System.out.println("\nParameterized constructor use:");
        System.out.println(customFan);

        customFan.setSpeed(3);
        customFan.setOn(true);
        customFan.setRadius(20);
        customFan.setColor("gold");

        System.out.println("\nUsing setters to change attributes of a fan:");
        System.out.println(customFan);
    }

    int STOPPED = 0;
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;

    private int speed = STOPPED;
    private boolean on;
    private int radius = 6;
    String color = "white";

    //no-arg constructor
    public Fan() {
    }

    //parameterized constructor
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Fan speed is: " + getSpeed() + "\nFan is on: " + isOn() + "\nFan size is: " + getRadius() +
                "\nFan color is: " + getColor();
    }
}
