//Dan Rojas
//18 Jan 26
//mod 1.3


/*
Written in Java Version 23.0.2
 */

import java.util.Scanner;

public class HeatWater {
    public static void main(String[] args) {
        System.out.println(energyNeededToHeatWater());
    }

    /**
     *
     * @return answer statement regarding energy needed to heat water
     */
    public static String energyNeededToHeatWater() {
        String degreeSign = "\u00B0";
        int waterMass;
        int initialTemperature;
        int finalTemperature;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        scannerIntCheck(sc);
        waterMass = sc.nextInt();

        System.out.println("Enter the initial water temperature in Celsius: ");
        scannerIntCheck(sc);
        initialTemperature = sc.nextInt();

        System.out.println("Enter the goal water temperature in Celsius: ");
        scannerIntCheck(sc);
        finalTemperature = sc.nextInt();

        sc.close();

        int result = waterMass * (finalTemperature - initialTemperature) * 4184;
        return "Energy needed to heat " + waterMass + " kg of water from " + initialTemperature + degreeSign + " to " + finalTemperature + degreeSign + " is " + result + " J.";
    }


    /**
     *
     * @param sc scanner passed in to do validation
     */
    public static void scannerIntCheck(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter an integer");
            sc.next();
        }
    }
}
