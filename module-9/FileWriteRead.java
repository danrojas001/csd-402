//Dan Rojas
//01 Mar 26
//mod 9.2

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileWriteRead {
    public static void main(String[] args) {
        writeAndReadFile();
    }

    public static void writeAndReadFile() {
        int[] randTen =  new int[10];
        Random rand = new Random();

        //fill array with 10 random int values
        for (int i = 0; i < randTen.length; i++) {
            randTen[i] = rand.nextInt(100) + 1;
        }

        //try-with-resources to automatically close the file at then end of the block
        try (FileWriter fw = new FileWriter("data.file", true)) {
            for  (int i : randTen) {
                fw.write(i + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //try-with-resources to automatically close the file at then end of the block
        try (Scanner sc = new Scanner(new File("data.file"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
