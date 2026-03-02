//Dan Rojas
//01 Mar 26
//mod 9.2

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> tenStrings = new ArrayList<>();
        tenStrings.add("Apple");
        tenStrings.add("Banana");
        tenStrings.add("Cherry");
        tenStrings.add("Dragon Fruit");
        tenStrings.add("Elderberry");
        tenStrings.add("Fig");
        tenStrings.add("Grape");
        tenStrings.add("Honeydew Melon");
        tenStrings.add("Jack Fruit");
        tenStrings.add("Kumquat");

        display(tenStrings);
        stringSelection(tenStrings);
    }

    public static void display(ArrayList<String> tenStrings) {
        for (String string : tenStrings) {
            System.out.println(string);
        }
    }

    public static void stringSelection(ArrayList<String> tenStrings) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\nWhich element in the Arraylist would you like to see again?(The array is 0-indexed)");
            String userInput = sc.nextLine();
            //autoboxing
            Integer unserInputAsInteger =  Integer.parseInt(userInput);
            //unboxing
            String userChoice = tenStrings.get(unserInputAsInteger);
            System.out.println(userChoice);
            sc.close();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds. Please enter a number between 0 and " + (tenStrings.size() - 1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 0 and " + (tenStrings.size() - 1));
        }
    }
}
