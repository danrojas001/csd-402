//Dan Rojas
//14 Feb 26
//mod 7.2

// 1. Starting with your code from the Module 6 Programming Assignment,
// 2. create the following new class titled UseFans:
//
// 3. Create a collection of Fan instances.
// 4. Create a method taking a collection of Fan instances for displaying without using the toString() method.
// 5. Create a method that takes a single instance of a Fan for displaying without using the toString() method.
// 6. Use the ‘this’ reference throughout the Fan class where allowed.
// 7. Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the
// collection.

class Main {
    static void main() {
        // 3. Create a collection of Fan instances.
        // 7. Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the
        // collection.
        Fan[] fans = {
                new Fan(1, true, 3, "red"),
                new Fan(2, true, 6, "blue"),
                new Fan(3, true, 9, "green")
        };

        UseFans.showFans(fans);
        UseFans.showFan(fans[0]);
    }
}

// 2. create the following new class titled UseFans:
public final class UseFans {

    private UseFans() {
    }

    // 4. Create a method taking a collection of Fan instances for displaying without using the toString() method.
    public static void showFans(Fan[] fans) {
        System.out.println("\nOutput for method, showFans(), that takes a collection of Fan instances");
        for (Fan fan : fans) {
            System.out.println("\nFan speed is: " + fan.getSpeed() + "\nFan is on: " + fan.isOn() + "\nFan size is: " + fan.getRadius() +
                    "\nFan color is: " + fan.getColor());
        }
    }

    // 5. Create a method that takes a single instance of a Fan for displaying without using the toString() method.
    public static void showFan(Fan fan) {
        System.out.println("\nOutput for method, showFan(), that takes a single instance of Fan");
        System.out.println("\nFan speed is: " + fan.getSpeed() + "\nFan is on: " + fan.isOn() + "\nFan size is: " + fan.getRadius() +
                "\nFan color is: " + fan.getColor());
    }
}

// 1. Starting with your code from the Module 6 Programming Assignment,
class Fan {

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
        return "Fan speed is test: " + getSpeed() + "\nFan is on: " + isOn() + "\nFan size is: " + getRadius() +
                "\nFan color is: " + getColor();
    }
}