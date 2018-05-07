/**
 * Created by David on 5/2/2018.
 */

import javax.swing.*;
import java.io.*;

public class Lab7 {

    /**
     * get input file This content is spliced from Lab1
     * @return Scanner file for input
     * @throws IOException
     * @author harmssk
     * @date January 2017
     */
    private static File getInputFile() throws IOException {
        // Get the INPUT filename.
        JFileChooser chooser = new JFileChooser();
        File home = new File(System.getProperty("user.home"));
        chooser.setCurrentDirectory(home);
        int status = chooser.showOpenDialog(null);

        if (status != JFileChooser.APPROVE_OPTION) {
            System.out.println("No File Chosen");
            System.exit(0);
        }

        // Open the file.
        return chooser.getSelectedFile();
    }

    /**
     This program opens a binary file, reads
     and displays the contents.
     @author harmssk - Written by Sherri Harms
     adapted by David C
     */
    public static void main(String[] args) throws IOException {
        {
            Double number; // A number read from the file
            boolean endOfFile = false;     // EOF flag
            Double numberArray[] = new Double[5];
            int count = 0;

            // Create the binary file input objects.
            FileInputStream fstream =
                    new FileInputStream(getInputFile());
            DataInputStream inputFile =
                    new DataInputStream(fstream);

            System.out.println("Reading numbers from the file:");

            // Read the contents of the file.
            while (!endOfFile && count< 5)
            {
                try
                {
                    number = inputFile.readDouble();
                    numberArray[count] = number;
                    System.out.print(number + " ");
                    count++;
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
            }

            System.out.println("\nDone.");

            // Close the file.
            inputFile.close();

            Double sum = 0.0;
            for(int i = 0; i < numberArray.length; i++){
                sum+= numberArray[i];
            }
            System.out.println(sum / numberArray.length);
        }


    }

}
