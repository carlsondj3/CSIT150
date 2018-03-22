/**
 * Race class used to simulate a race of cars
 * the cars are stored in an array
 * Uses a dice to decide which car and what action to take as the race progresses
 *
 * CSIT 150 lab 3
 *
 * @author Harms
 */

public class Race {
    private static final double DEFAULTRACEDISTANCE = 500;
    private Car[] raceCars;
    private double distance;
    private Car winner;  //starts as null - when the race is not finished.
    private int carCount;  //Actual number of cars in the race. It ranges from 0 to the size of the array.

    /**
     * Make a default array of 3 cars. set carCount =0. Set distance to the default distance. winner is null.
     * Be careful - each car is NULL at this point.
     */
    public Race() {
        raceCars = new Car[3];
        carCount = 0;
        distance = DEFAULTRACEDISTANCE;
        winner = null;
    }

    /**
     * creates the race that can handle inMaxCars number of cars. See default constructor for other variables.
     *
     * @param inMaxCars
     */
    public Race(int inMaxCars) {
         raceCars = new Car[inMaxCars];
    }

    /**
     * set the distance of the race
     * @param inDistance - distance of the face
     */
    public void setDistance(double inDistance) {
        distance = inDistance;
    }

    /**
     * this is a PRIVATE method only called from other methods in this class
     * This does NOT need to be a deep copy, since the winning car of the race
     * will truly be one of the cars in the array
     * Thus, simply set the winner to the car in the array[winningCarIndex]
     * @param winningCarIndex - index in the array of the winning car
     */
    private void setWinner(int winningCarIndex) {
        winner = raceCars[winningCarIndex];
    }

    /**
     * Return winning car as a string value
     * if the winner is unknown, return the phrase Race winner is unknown at this time
     * @return string value of the winning car
     */
    public String getWinner() {
        if(winner == null){
            return "There is no Winner at this time.";
        }
        else{
            return winner.getOwner();
        }
    }

    /**
     * return the number of actual cars in the race
     * @return number of cars in the race
     */
      public int getCarCount() {
          return carCount;
      }

    /**
     * Add a car to the race
      * verify that you have space in the array. If not, you will need to increase the size of the array
     * be sure to add a COPY of the car.
     * be sure to increment the carCount
     * @param car - car to be added to the race
     */
    public void addCar(Car car) {
        carCount++;
        boolean space = false;
        int spaceNum = 0;


        for( int i = 0; i < raceCars.length; i++){
            if(raceCars[i] == null){
                space = true;
                spaceNum = i;
                break;
            }
        }
        if(!space){
            Car[] placeholder = new Car[carCount];
            for(int i = 0; i < raceCars.length; i++){
                placeholder[i] = raceCars[i];
            }
            placeholder[raceCars.length] = car.makeCopyCar();
            raceCars = placeholder;
        }
        if(space){
            raceCars[spaceNum] = car.makeCopyCar();
        }
    }


    /**
     * return the distance of the race
     * @return distance of the race
     */
    public double getDistance() {
        return distance;
    }

    /**
     * DEEP copy
     * return a copy of the array of cars. Each car in the new array, should also be a copy.
     */
    public Car[] getCars() {
        int carCount = raceCars.length;
        Car[] copyArray = new Car[carCount];

        for(int i = 0; i < carCount; i++){
            copyArray[i] = raceCars[i].makeCopyCar();
        }

        return copyArray;
    }

    /**
     * to String method
     * @return the value of the race
     */
  public String toString() {
      if(winner == null){
          return "There is no Winner at this time.";
      }
      else{
          return winner + " is the Winner of the race!";
      }
  }

    /**
     * method used to simulate running the race
     * To simulate the race, this method rolls a Dice object to select the current action, until one of the cars reaches the finish line.
     Dice raceDice = new Dice(carCount*3);
     Select which car and what action number based on the dice roll:
     int diceRoll = (raceDice.roll()
     int carToMove = (diceRoll -1)/3
     int action = (diceRoll -1)%3
     If the action is 0, then move the car for one minute. If action is 1, then brake the car. If action is 2, then accelerate the car.  Remember, the car cannot exceed its max speed, nor go below 0 mph.
     Continue selecting cars and actions in this manner until one of the car reaches (or passes the finish line) as the action is executed.
     Set the winner of the race appropriately.
     */
    public void runRace() {
        Dice raceDice = new Dice(carCount*3);
        //int diceRoll = (raceDice.roll());
        //int carToMove = (diceRoll -1)/3;
        //int action = (diceRoll -1)%3;

        while( winner == null){
            for(int i = 0; i< raceCars.length; i++){
                int diceRoll = (raceDice.roll());
                int action = (diceRoll-1)%3;
                if(action == 0){
                    raceCars[i].move();
                }
                if(action == 1){
                    raceCars[i].brake();
                    raceCars[i].move();
                }
                if(action == 2){
                    raceCars[i].accelerate();
                    raceCars[i].move();
                }
                if(raceCars[i].getdistanceTraveled() > distance){
                    winner = raceCars[i];
                    break;
                }
            }


        }
    }

    //-----------------------------------------------------------------
    /**
     *     Private method
     *     Doubles the size of the collection by creating a larger array
     *     and copying the existing collection into it. (See the CD Collection example)
     *     */
     private void increaseSize() {
    }

}
