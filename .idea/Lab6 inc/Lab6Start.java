import javax.swing.*;

/***********************************************************************************************************
 * CSIT 150 Lab 6 Spring 2018
 *
 * Imagine that you are developing a software package that requires users to enter their own
 passwords. Your software requires that user passwords meet the following criteria:

  The password should be at least six characters long.
  The password should contain at least one uppercase and at least one lowercase letter.
  The password should have at least one digit and one special character.
 (A special character is not alphabetic and is not a digit).
  The password should not be in the array of not allowed passwords.
 In general, this array may include several words, or be null.
 For testing purposes, do not allow passwords to be one of  the following strings: "Password1","Mypassw0rd".
 Ask for the user name and password.
 Keep asking for a password until the user enters a password that meets the criteria above.
 Output the username and the password. Then, output the user and the hidden password â€œ******â€.

 Add JavaDoc comments to this program.
 ********************************************************************************************************/

public class Lab6Start {

    private static String[] notAllowed = {"Password1", "Mypassw0rd"};

    public static boolean isAllowed(String passWord, String[] notAllowed) {
        boolean allowed = true;
        for(int i = 0; i < notAllowed.length; i++ ) {
            if(passWord == notAllowed[i]){
                allowed = false;
            }
        }
        return allowed;
    }

    public static boolean isValidPassword(String passWord) {
        boolean valid = false;

        return valid;

    }

    public static StringBuffer hidePassword(String passWord) {
        StringBuffer hiddenPassword = new StringBuffer(passWord);
        return hiddenPassword;
    }

    public static void main(String[] args) {

        boolean valid = true;
        String userName = "";
        String passWord = "";
        userName = JOptionPane.showInputDialog(null, "Enter your username: ");
        passWord = JOptionPane.showInputDialog(null, "Enter your password: ");
        valid = isValidPassword(passWord);
        while (!valid) {
            passWord = JOptionPane.showInputDialog(null, "Invalid password. Enter a new password: ");
            valid = isValidPassword(passWord);
        }
        StringBuffer hiddenPassword = hidePassword(passWord);
        System.out.println("The username: " + userName + " has password: " + passWord);
        System.out.println("The username: " + userName + " with hidden password: " + hiddenPassword);

    }
}