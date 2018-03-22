/**
 * 1. C
 * 2. B
 * 3. A
 * 4. D
 * 5. A
 * 6. A
 * 7. B   INCORRECT
 * 8. B
 * 9. C
 * 10. A
 * 11. B
 * 12. c
 * 13.
 public class MyClass {
 private int x;
 private double y;
 public void setValues(int a, double b) {
 x = a;
 y = b;
 }

 public int getX(){
 return x;
 }

 public double getY() {
 return y;
 }
 }


 *Now for the description of this program... This is the game driver that runs with Player.java and GameBoard.java.
 * It contains the psvm and proffers simple instructions to follow. Player 1 enters which symbol they would prefer to use
 * and player 2 automatically takes the opposite. As for the standard rules X gets to go first. It cycles player moves while
 * also checking to see if the game has ended by Cat's Game or if someone has won. It then adds the game win to respective
 * winning player's counter, then asks if you would like to play another game. Any symbol besides y states otherwise and
 * brings out the concluding goodbye and the end of the program.
 * Created by David on 2/10/2018.
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueResponse = "y";
        int position = 0;
        System.out.print("Hello and welcome to the Tic Tac Toe digital simulator. Now... SHall WE PLay A GAme?\n");
        System.out.println("Now which Piece would you like to be Player 1? X or O?");
        String nameString = keyboard.next();
        while(!(nameString.equalsIgnoreCase("X") || nameString.equalsIgnoreCase("O"))){
            System.out.println("That is not recognized please try again. Use either X or O");
            nameString = keyboard.next();
        }
        //Determines who plays with which symbol.
        char StringtoNameChar = nameString.charAt(0) ;
        Player player1 = new Player(StringtoNameChar);
        Player player2 = new Player('X');
        if(player1.getName() == 'X') {
            System.out.println("Thanks, So that leaves O for Player 2.");
            player2.setName('O');
        }
        if(player1.getName() == 'O') {
            System.out.println("Thanks, So that leaves X for Player 2.");
        }
        //The loop that runs continuously while the game is not tied or finished. Checks between moves
        while(continueResponse.equalsIgnoreCase("Y")){
            GameBoard theboard = new GameBoard();
            System.out.println("Now lets get started. As is custom, X gets to go first");
            //If player 1 is X and therefore goes first...
            if(player1.getName() == 'X') {
                while (!(theboard.catCheck()) && !(theboard.checkForWinner(player1, player2, 0))) {
                    System.out.println("Player 1, where would you like to move?");
                    theboard.showBoard();

                    theboard.playerMove(keyboard.nextInt(), player1);
                    if (!(theboard.catCheck()) && !(theboard.checkForWinner(player1, player2, 0))) {
                        System.out.println("Player 2, where would you like to move?");
                        theboard.showBoard();
                        theboard.playerMove(keyboard.nextInt(), player2);
                        theboard.showBoard();
                    }
                }
            }
            //If player 1 is not X and therefore goes second...
            if(player1.getName() == 'O') {
                while (!(theboard.catCheck()) && !(theboard.checkForWinner(player1, player2,0))) {
                    System.out.println("Player 2, where would you like to move?");
                    theboard.showBoard();

                    theboard.playerMove(keyboard.nextInt(), player2);
                    if (!(theboard.catCheck()) && !(theboard.checkForWinner(player1, player2,0))) {
                        System.out.println("Player 1, where would you like to move?");
                        theboard.showBoard();
                        theboard.playerMove(keyboard.nextInt(), player1);
                        theboard.showBoard();
                    }
                }
            }

            theboard.checkForWinner(player1, player2, 1);
            System.out.println("The scores so far...." +"\n" + "Player 1 has: " + player1.getWinCount() +" wins\n"
                    + "Player 2 has: " + player2.getWinCount() + " wins");
            theboard.showBoard();
            System.out.println("Would you like to play again? Y/N?");
            continueResponse = keyboard.next();
        }

        System.out.println("Perhaps it is better to not play at all then");
        System.out.println("Goodbye");
    }
}
