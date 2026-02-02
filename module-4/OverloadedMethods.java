//Dan Rojas
//01 Feb 26
//mod 4.2


import java.util.Arrays;

public class OverloadedMethods {
    public static void main(String[] args) {

        short[] shortArray = {2, 4, 6};
        int[] intArray = {2, 4, 6, 8};
        long[] longArray = {2, 4, 6, 8, 10};
        double[] doubleArray = {2, 4, 6, 8, 10, 12};

        short shortAverage = average(shortArray);
        System.out.println("\nProvided short array: " + Arrays.toString(shortArray) + "\nshort array average: " + shortAverage);

        int intAverage = average(intArray);
        System.out.println("\nProvided int array: " + Arrays.toString(intArray) + "\nint array average: " + intAverage);

        long longAverage = average(longArray);
        System.out.println("\nProvided long array: " + Arrays.toString(longArray) + "\nlong array average: " + longAverage);

        double doubleAverage = average(doubleArray);
        System.out.println("\nProvided double array: " + Arrays.toString(doubleArray) + "\ndouble array average: " + doubleAverage);

        //Added this as I was unsure if you meant you wished to have the average value of ALL averages returned.
        System.out.println("\nAverage of all 4 averages: " + ((shortAverage + intAverage + longAverage + doubleAverage) / 4));
    }

    public static short average(short[] array) {
        short total = 0;
        for (short num : array) {
            total += num;
        }
        return (short) (total / array.length);
    }

    public static int average(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return (total / array.length);
    }

    public static long average(long[] array) {
        long total = 0;
        for (long num : array) {
            total += num;
        }
        return (total / array.length);
    }

    public static double average(double[] array) {
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return (total / array.length);
    }


}
