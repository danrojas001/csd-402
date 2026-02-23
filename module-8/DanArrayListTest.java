//Dan Rojas
//22 Feb 26
//mod 8.2

import java.util.ArrayList;
import java.util.Scanner;

public class DanArrayListTest {
    public static void main(String[] args) {
        Integer largest = max(getArrayList());
        System.out.println("\n" +
                "**********************************\n" +
                "The maximum value is " + largest +
                "\n**********************************");
    }

    /**
     *
     * @param list arrayList created from user input gathered in getArrayList()
     * @return largest Integer value in provided arraylist
     */
    public static Integer max(ArrayList list) {
        int largestValue = (int) list.getFirst();

        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > largestValue) {
                largestValue = (int) list.get(i);
            }
        }
        return largestValue;
    }

    /**
     *
     * @return arraylist created from user input
     */
    public static ArrayList<Integer> getArrayList() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> UserArrayList = userInputvalidation(sc);
        sc.close();
        return UserArrayList;
    }

    /**
     *
     * @param sc scanner created in getArrayList() to take user input
     * @return validated arrayList
     */
    public static ArrayList<Integer> userInputvalidation(Scanner sc) {
        ArrayList<Integer> userNumbers = new ArrayList();
        boolean firstInput = true;

        while (true) {
            System.out.println("\nInput an Integer ('0' to end) then press \"Enter\".");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                if (firstInput) {
                    userNumbers.add(0);
                    System.out.println("No value detected. '0' added. Input phase concluded.");
                    break;
                } else {
                    System.out.println("INVALID: No value detected. Input must be a single integer.");
                    continue;
                }
            }

            if (input.matches("[0-9]+")) {
                int number = Integer.parseInt(input);
                userNumbers.add(number);

                if (number == 0) {
                    System.out.println("'0' value detected. input phase concluded.");
                    break;
                }
            } else {
                System.out.println("INVALID: Input must be a single integer.");
                continue;
            }
            firstInput = false;
        }
        return userNumbers;
    }
}
