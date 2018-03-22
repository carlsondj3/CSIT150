/**
 * Created by David on 2/10/2018.
 */
public class GameBoard {
    private char position = 48;
    char[][] board = new char[3][3];

    public GameBoard() {
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                board[r][c] = position++;
            }
        }

    }

    /**
     * a simple to string method, that prints all values on the board in the array, constant use avoids stale data.
     */
    public void showBoard() {

        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                System.out.print( " ["+ board[r][c] +"] ");
            }
            System.out.println();
        }
    }

    /**
     * A mutator for positions on the GameBoard(), converts the player's desired position into Char and compares it to
     * the corresponding position in the 2d array. If the converted player choice position number is not equal to the vanilla
     * placeholder then it responds with an error.
     * @param place the player's desired position to fill
     * @param p the actual player, takes this in to know which symbol to place.
     */
    public void playerMove(int place, Player p){
        boolean actionTaken = false;

        char charPlace = (char) (place + 48);
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (charPlace == board[r][c]) {
                    board[r][c] = p.getName();
                    //System.out.print(board[r][c] + " ");
                    actionTaken = true;
                    break;
                }


            }
        }
        if (actionTaken == false) {
            System.out.println("Failed to place, How did you mess that up? You being too silly has cost you this turn!");
        }


    }

    /**
     * A more weighty method, used to check if someone has a game, and under a certain instance print the results.
     * @param inPlayer1 The first player
     * @param inPlayer2 The second player
     * @param notCheck If the purpose is to use this as a check, enter a 0, prevents excessive print dialogs.
     *                 If the purpose is to use this as a print, enter a 1, allows accurate use of Player.winGame();
     * @return True/False
     *         True - Someone has won the game
     *         False - the game is incomplete, a winner has not been determined, use in conjunction w/ catCheck();
     */
    public Boolean checkForWinner(Player inPlayer1, Player inPlayer2, int notCheck) {
        char position =48;
        char X = inPlayer1.getName();
        char O = inPlayer2.getName();
        String gameIncomplete = "The game is currently not finished";
       // String Owin = "Player O wins";


        //diagonal win for X left to right
        for(int d = 0; d < 1; d++) {
            if (board[0][0] == X && board[1][1] == X && board[2][2] == X) {
                if(notCheck > 0) {
                    System.out.println("By Diagonal \\");
                    System.out.println("Player 1 wins");
                    inPlayer1.winGame();
                }
                return true;
            }
        }
        //diagonal win for O left to right
        for(int d = 0; d < 1; d++) {
            if (board[0][0] == O && board[1][1] == O && board[2][2] == O) {
                if(notCheck > 0) {
                    System.out.println("By Diagonal \\");
                    System.out.println("Player 2 wins");
                    inPlayer2.winGame();
                }
                return true;
            }
        }
        //diagonal win for X right to left
        for(int d = 0; d < 1; d++) {
            if (board[0][2] == X && board[1][1] == X && board[2][0] == X) {
                if(notCheck > 0) {
                    System.out.println("By Diagonal /");
                    System.out.println("Player 1 wins");
                    inPlayer1.winGame();
                }
                return true;
            }
        }
        //diagonal win for O right to left
        for(int d = 0; d < 1; d++) {
            if (board[0][2] == O && board[1][1] == O && board[2][0] == O) {
                if(notCheck > 0) {
                    System.out.println("By Diagonal /");
                    System.out.println("Player 2 wins");
                    inPlayer2.winGame();
                }
                return true;
            }
        }
        //vertical win for O
        for(int c = 0; c < 3; c++) {
            if (board[0][c] == O && board[1][c] == O && board[2][c] == O) {
                if(notCheck > 0) {
                    System.out.println("By Vertical Column " + c);
                    System.out.println("Player 2 wins");
                    inPlayer2.winGame();
                }
                return true;
            }
        }
        //vertical win for X
        for(int c = 0; c < 3; c++) {
            if (board[0][c] == X && board[1][c] == X && board[2][c] == X) {
                if(notCheck > 0) {
                    System.out.println("By Vertical Column " + c);
                    System.out.println("Player 1 wins");
                    inPlayer1.winGame();
                }
                return true;
            }
        }
        //horizontal win for X
        for(int r = 0; r < 3; r++) {
            if (board[r][0] == X && board[r][1] == X && board[r][2] == X) {
                if(notCheck > 0) {
                    System.out.println("By Vertical Column " + r);
                    System.out.println("Player 1 wins");
                    inPlayer1.winGame();
                }
                return true;
            }
        }
        //horizontal win for O
        for(int r = 0; r < 3; r++) {
            if (board[r][0] == O && board[r][1] == O && board[r][2] == O) {
                if(notCheck > 0) {
                    System.out.println("By Vertical Column " + r);
                    System.out.println("Player 2 wins");
                    inPlayer2.winGame();
                }
                return true;
            }
        }

        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                if(board[r][c] == position++){
                    return false;
                }

            }
        }

        //System.out.println("oops something failed checkForWinner failed");
        return false;
    }

    /**
     * Checks the board to see if the game is a catgame or not. Either True, the game is a catgame, or False, the game isn't a catgame.
     * @return True/False
     */
    public boolean catCheck() {
        position = 48;
        int difPosition =0;
        boolean ruling = false;
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                if(!(board[r][c] == position++)){
                    difPosition++;
                }
            }
        }
        if(difPosition == 9){
            System.out.println("It's a Cat's Game!");
            ruling = true;
        }
        return ruling;
    }


}
