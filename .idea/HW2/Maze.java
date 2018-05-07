/**
 * Created by David on 3/1/2018.
 */
import java.io.*;
import java.util.*;

public class Maze {

    private int rows = 0;
    private int cols = 0;
    private int startRow = 0;
    private int startCol = 0;
    private int exitRow = 0;
    private int exitCol = 0;
    private Character[][] mazeSize;

    public Maze(File inputFile) throws IOException{
        FileReader readFile = new FileReader(inputFile);
        Scanner scanner = new Scanner(inputFile);
        rows = readFile.read();
        cols = scanner.nextInt();
        mazeSize = new Character[rows][cols];
        startRow = scanner.nextInt();
        startCol = scanner.nextInt();
        exitRow = scanner.nextInt();
        exitCol = scanner.nextInt();

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                mazeSize[r][c] = scanner.next().charAt(0);
            }
        }

    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public int getStartRow() {
        return startRow;
    }

    public int getStartCol(){
        return startCol;
    }

    public int getExitRow(){
        return exitRow;
    }

    public int getExitCol(){
        return exitCol;
    }

    public char getCell(int row, int col){
        return mazeSize[row][col];
    }

    public boolean openCell(int row, int col){
        if(mazeSize[row][col] == ' '){
            return true;
        }
        else return false;
    }

    public void setCell(int row, int col, char newCh){
        mazeSize[row][col] = newCh;
    }



}
