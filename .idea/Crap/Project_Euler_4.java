/**
 * Created by David on 2/13/2017.
 */



public class Project_Euler_4 {
    public static void main(String[] args) {
        String test = "Hello Dave, This is the highest Palindrome.";
        int firstNum = 1;
        int secondNum = 0;
        int highestPalin = 0;
        int product = 0;


        for(firstNum = 0; firstNum < 999; firstNum++) {
           for (secondNum = 0; secondNum < 999; secondNum++) {

                product = firstNum * secondNum;
                String wordVersion = Integer.toString(product);

                if (palindromeREC(wordVersion) && (product > highestPalin) ) {
                   highestPalin = product;
                   System.out.println(secondNum);
                   System.out.println(product);
                }

           }
        }

        System.out.println(test + " : " +highestPalin);
        System.out.println("Thats all she Wrote Dude");
        //System.out.println(firstNum + ":::" + secondNum);

       // String Fest = "906609";
       // if(palindromeREC(Fest)){
       //     System.out.println(Fest + " really works");
        //}
        //System.out.println(999*999);
    }


/*
    public static boolean palindrome (String word) {

        if(word.length() == 1) {
            return true;
        }

        if(word.charAt(0) == word.charAt(word.length()-1)) {
            return palindrome(word.substring(1, word.length()));
        }

        else{
            return false;
        }
    }
*/


    private static boolean palindromeREC (String word) {

        if(word.length() == 1) {
            return true;
        }
        if(word.length() == 2 && (word.charAt(0) == word.charAt(1))){
            return true;
        }

        if(word.length() % 2 > 0) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return palindromeREC(word.substring(1, word.length() - 1));
            }
        }

        if(word.length() % 2 == 0) {
            if (word.charAt(0) == word.charAt(word.length()-1)){
                return palindromeREC(word.substring(1, word.length()-1));
            }
        }

        else{
            return false;
        }
        return false;


    }


}
