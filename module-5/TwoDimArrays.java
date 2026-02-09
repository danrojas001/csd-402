//Dan Rojas
//02 Feb 26
//mod 5.2

void main() {

    double[][] doubleArray = {{2,  12, 9,  8},
                              {14, 16, 4,  6},
                              {1,  10, 3,  7},
                              {5,  15, 11, 13}};

    int[][] intArray = {{1, 5, 8},
                        {2, 4, 9},
                        {7, 3, 6}};

    IO.println("""
            
            For clarification, since arrays are 0-indexed, an output of [0,0] would mean first \
            array, first element.
            """);
    IO.println("Call to locateLargest method given a double Array: " + Arrays.toString(locateLargest(doubleArray)));
    IO.println("Call to locateLargest method given a int Array: " + Arrays.toString(locateLargest(intArray)));
    IO.println();
    IO.println("Call to locateSmallest method given a double Array: " + Arrays.toString(locateSmallest(doubleArray)));
    IO.println("Call to locateSmallest method given a int Array: " + Arrays.toString(locateSmallest(intArray)));
}

public static int[] locateLargest(double[][] arrayParam) {
    double largestDouble = arrayParam[0][0];
    int[] locArray = new int[2];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > largestDouble) {
                largestDouble = arrayParam[row][col];
                locArray = new int[]{row, col};
            }
        }
    }
    return locArray;
}

public static int[] locateLargest(int[][] arrayParam) {
    int largestInt = arrayParam[0][0];
    int[] locArray = new int[2];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] > largestInt) {
                largestInt = arrayParam[row][col];
                locArray = new int[]{row, col};
            }
        }
    }
    return locArray;
}

public static int[] locateSmallest(double[][] arrayParam) {
    double smallestDouble = arrayParam[0][0];
    int[] locArray = new int[2];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < smallestDouble) {
                smallestDouble = arrayParam[row][col];
                locArray = new int[]{row, col};
            }
        }
    }
    return locArray;
}

public static int[] locateSmallest(int[][] arrayParam) {
    int smallestInt = arrayParam[0][0];
    int[] locArray = new int[2];

    for (int row = 0; row < arrayParam.length; row++) {
        for (int col = 0; col < arrayParam[row].length; col++) {
            if (arrayParam[row][col] < smallestInt) {
                smallestInt = arrayParam[row][col];
                locArray = new int[]{row, col};
            }
        }
    }
    return locArray;
}
