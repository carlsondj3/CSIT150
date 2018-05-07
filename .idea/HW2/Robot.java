/**
 * Created by David on 3/2/2018.
 */
public class Robot {

    public Robot(){
        int currentCol = 0;
        int currentRow = 0;
    }


    public Robot(Maze maze){
        int currentCol = maze.getStartCol();
        int currentRow = maze.getStartRow();
    }


    public class RandomRobots extends Robot{

    }

    public class RightHandRobot extends Robot{

    }



}
