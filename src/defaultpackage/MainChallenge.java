package defaultpackage;
import java.util.Scanner;
import java.io.*;

public class MainChallenge {

    public static void main(String[] args) {

        int totalLineCount = 0;

        try {
            // Creates a new file object
            File myFile = new File("src\\data.csv");

            // Creates a scanner object for the file
            Scanner sc = new Scanner(myFile);

            // Reads each line and counts number of lines
            while (sc.hasNextLine()) {
                sc.nextLine();
                totalLineCount++;
            }

            System.out.println("There are " + totalLineCount + " total rows in this file.");

            // Closes scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
