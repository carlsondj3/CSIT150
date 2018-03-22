
/********************************************************************
 Car.java
 Author: Dr. Sherri Harms
 Adapted by: David Carlson

 Represents a car that can accelerate, brake, and move
 Used in the race program
 ********************************************************************/

public class Car {
    int count =0;

    private static final int DEFAULTMAXSPEED = 100;
    //declare private member variables here
    private String owner;
    private int currentSpeed;  //in terms of mph
    private double distanceTraveled;  // in terms of miles
    private int maxSpeed; //in terms of mph

    /**
     * Constructor initializes a car
     *
     * @param newOwner    - owner of the car
     * @param newMaxSpeed - max speed of the car
     */
    public Car(String newOwner, int newMaxSpeed) {
        owner = newOwner;
        currentSpeed = 0;
        maxSpeed = newMaxSpeed;
        distanceTraveled = 0;
        count++;
    }

    public void displayCount() {
        System.out.println(count);
    }

    /**
     * Default constructor
     */
    public Car() {
        this("no owner", DEFAULTMAXSPEED);
    }

    //BONUS - add copy constructor. Be sure to test it in the TestCar program.

    /**
     * Moves the car a distance at current speed. each use represents 1 min of driving.
     */
    public void move(Car car) {
        double CurSpeed = car.getCurrentSpeed();
        double distance = car.getdistanceTraveled();
        car.distanceTraveled = distance + CurSpeed/60;
        //FINISH!! done
    }

    /**
     * Add 5 miles per hour to current speed
     * Remember: The most the current speed can be is the maxSpeed of the car
     */
    public void accelerate(Car car) {
        if(car.getCurrentSpeed() < car.getMaxSpeed()){
            car.currentSpeed += 5;
            System.out.print(car.getOwner()+"'s car");
            System.out.print("  Sped up 5mph");
            String speed = Integer.toString(car.getCurrentSpeed());
            System.out.print("  Current speed is:" + speed + "\n");
        }
        else{System.out.println("You are already going at your car's Max, never forget Ryan Dunn!");}
        //FINISH!! done
    }

    /**
     * subtract 5 miles per hour from the current speed
     * Lines added for bottom boundary and hitting it.
     */
    public void brake(Car car) {
        if(car.getCurrentSpeed() > 0){
            car.currentSpeed -= 5;
            System.out.print(car.getOwner()+"'s car");
            System.out.print("  Slowed 5mph");
            String speed = Integer.toString(car.getCurrentSpeed());
            System.out.print("  Current speed is:" + speed + "\n");
        }
        else{ System.out.println("You are already stopped, Failed to slow");}
        //FINISH!! done
    }


    //ADD MUTATOR METHODS

    /**
     * @return the current speed of the car
     */
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * @return the max speed of the car
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @return the distance traveled for the car
     */
    public double getdistanceTraveled() {
        return distanceTraveled;
    }

    public String getOwner() {
        return owner;
    }

    /**
     * @return the car values as a String
     */
    public String toString() {
        String carValue = owner + "'s car current speed: " + currentSpeed +
                " MPH, distance traveled: " + String.format("%8.2f",distanceTraveled) + " miles.";
        return carValue;
    }

    public void makeCopyCar(Car car, String NewName, String owner){
        int MaxSpeed = car.getMaxSpeed();
        Car copyCar = new Car(owner, MaxSpeed);
    }


}
