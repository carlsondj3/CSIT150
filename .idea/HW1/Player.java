/**
 * Created by David on 2/10/2018.
 */
public class Player {

    private char Name;
    private int gamesWonCount;


    public Player(char inName){
        if(inName == 'X' || inName == 'x'){
             Name = 'X';
        }
        if(inName == 'O' || inName == 'o'){
             Name = 'O';
        }
        int gamesWonCount= 0;
    }

    /**
     * Basic accessor for Player
     * @return an int containing the number of games won gamesWonCount
     */
    public int getWinCount() {
        return gamesWonCount;
    }

    /**
     * basic mutator for Player, specifically the counter for total games won
     * adds 1 per use to counter
     */
    public void winGame() {
        gamesWonCount++;
    }

    /**
     * basic accessor for Player
     * @return a Char containing the symbol chosen by the player
     */
    public char getName() {
        return Name;
    }

    /**
     * basic mutator for Player, This is used to change or set a symbol, context appropriate, for the Player
     * @param newName
     */
    public void setName(char newName) {
        Name = newName;
    }

    /**
     * Basic print method, prints A Player's Name and WinCount.
     */
    public void printString() {
        System.out.println("Player: " + Name + " has won " + getWinCount() + " games." );
    }


}
