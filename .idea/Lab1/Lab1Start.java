/**
 * adapted by David Carlson on 1/18/2018.
 */
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/***
 * Lab 1 is an example of using a two-dimensional array of temperatures.
 * This lab uses the same data file as Lab 15 from the fall 2012 CSIT 130 class.
 * @author harmssk
 * @date January 2017
 *
 */


public class Lab1Start {

    final static int MONTHS = 12;
    final static int NUMYEARS = 6;

    /**
     * get input file
     *
     * @return Scanner file for input
     * @throws IOException
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
     * @param args
     */
    public static void main(String[] args) throws IOException {
        DecimalFormat formatter = new DecimalFormat("0.0");
        File inputFile = getInputFile();

        //Store the month names
        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"};

        //FINISH

        //Store the temperatures for the first day of the month for six years
        //into a two dimensional array, by calling the readFile method

        //starting output message
        System.out.println("Average temperatures");

        //for each month (create and call methods as needed)
        //calculate the monthly average of the temperatures in the array
        // bonus: calculate the monthly standard deviation of the temperatures in the array
        //output the month name, the average temperature and for bonus the standard deviation.

        //output the column averages - create methods as needed
        System.out.println("Thank you.");
    }

    /**
     * Calculate the average of temperatures for a month, stored a 1 dim array
     *
     * @param monthTemps
     * @return average of the numbers in the array
     */
    private static double calcRowAverage(double[] monthTemps) {
        double sum = 0;
        for (int i = 0; i < monthTemps.length; i++) {
            sum += monthTemps[i];
        }
        return sum / monthTemps.length;
    }

    /**
     * read the temperature data into a two-dimensional array
     *
     * @param inputFile
     * @return
     * @throws FileNotFoundException
     */
    private static double[][] readFile(File inputFile) throws IOException {
        Scanner inputScanner = new Scanner(inputFile);
        int m = 0;//current month value to store temperatures
        double[][] temperatures = new double[MONTHS][NUMYEARS];
        while (inputScanner.hasNext() && m < MONTHS) {
            String monthData = inputScanner.nextLine();
            String[] splitData = monthData.split(",");
                for (int col = 0; col < 6; col++) {
                    temperatures[m][col] = Double.parseDouble(splitData[col + 1]);
                }
            m++;
            //FINISH
            //For each temperature
            //read temperature value from the splitData and store into the correct spot in the array

            //get ready to read the next line in the file (for the next month)
        }
        //remember to close the file

        return temperatures;
    }



    private static double[] getRowAverage(Double[] array) throws IOException{
        double avg = 0;
        double butt[] = new double[0];

     return butt;
    }

}