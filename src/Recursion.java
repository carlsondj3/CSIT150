import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by David on 3/21/2018.
 */
public class Recursion {

    public static void main(String[] args) throws IOException {
        File inputFile = getInputFile();
        Scanner readFile = new Scanner(inputFile);
        while(readFile.hasNextLine()){
            String word = readFile.nextLine();
            if(palindrome(word)){
                System.out.print(word+ " is a palindrome through Recursion ::: ");
            }
            if(palindromeIterative(word)){
                System.out.print(word+ " is a palindrome through Iteration" + "\n");
            }
            else{
                System.out.println(word + " is not a palindrome.");
            }
        }
    }

    /**
     * this is a copy of an old recursive palindrome code form CSIT180 that I wrote.
     * Created by David on 2/13/2017
     * @param word takes the word being tested
     * @return returns a true or false rating for if a word is a palindrome
     */
    private static boolean palindrome(String word){
        if(word.length() == 1){
            return true;
        }
        if(word.length() == 2 && (word.charAt(0) == word.charAt(1))){
            return true;
        }
        if(word.length() % 2 > 0){
            if (word.charAt(0) == word.charAt(word.length() - 1)){
                return palindrome(word.substring(1, word.length() - 1));
            }
        }
        if(word.length() % 2 == 0){
            if (word.charAt(0) == word.charAt(word.length()-1)){
                return palindrome(word.substring(1, word.length()-1));
            }
        }
        else{
            return false;
        }
        return false;
    }

    /**
     * An iterative form to find out if a word is a palindrome
     * @param word takes the word being checked
     * @return a true or false
     */
    private static boolean palindromeIterative(String word){
        boolean status = false;
        if(word.length() == 1){
            return true;
        }
        if(word.length() == 2 && (word.charAt(0) == word.charAt(1))){
            return true;
        }
        if(word.length() % 2 > 0){
            for(int i = 0; i < word.length()/2; i++){
                if(word.charAt(i) == word.charAt((word.length()-1)-i)){
                    status = true;
                }
                else{
                    return false;
                }
            }
            return status;
        }
        if(word.length() % 2 == 0){
            for(int i = 0; i < word.length()/2; i++){
                if(word.charAt(i) == word.charAt((word.length()-1)-i)){
                    status = true;
                }
                else{
                    status = false;
                    break;
                }
            }
            return status;
        }
        else return false;
    }

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
}
