
/**
 * TestCar
 * Tests the Car object class by
 * simulating three cars driving home and back to school.
 * This does not match reality. We don't first accelerate, and then move.
 * You don't need to match the driving instructions perfectly either.
 * This is just to practice the use of objects.
 *
 * UNK CSIT 150
 * Lab 2
 * @author harmssk
 * Adapted by: David Carlson
 */
public class TestCar {
    public static void main(String[] args) {
        double distance = 0;
        String carName = "";
        Car sherriCar = new Car("Dr. Harms", 90);
        // Get on the interstate at 75 mph
        for (int i = 0; i * 5 < 75; i++)
            sherriCar.accelerate(sherriCar); //we accelerate 5 mph at a time
        //Drive Dr. Harms to see her kids in Lincoln - 110 minutes at 75 mph
        for (int i = 0; i < 110; i++)
            sherriCar.move(sherriCar);
        //when she gets to the Lincoln city limits, slow her car to 65 mph and then drive for 10 minutes
        for (int i = 0; i < 2; i++)
            sherriCar.brake(sherriCar);
        for (int i = 0; i < 10; i++)
            sherriCar.move(sherriCar);
        //output car information - showing how far she drove
        System.out.println(sherriCar);

        //create a car for you if you can drive home (or another CSIT 150 student if your home is across the ocean)
        // drive your car home - exact details are not necessary, this is just for fun
        //output car info
        Car davidCar = new Car("David", 80);
        for (int i = 0; i*5 < 25; i++){
            davidCar.accelerate(davidCar);
        }
        for (int i = 0; i < 1; i++){
            davidCar.move(davidCar);
        }
        for (int i = 0; i *5 < 25; i++){
            davidCar.brake(davidCar);
        }
        System.out.println(davidCar);
        //create a car for a second CSIT 150 student
        //drive their car home exactness are not necessary, this is just for fun
        //output car info
        Car tannerCar = new Car("Tanner", 95);
        for (int i = 0; i*5 < 25; i++){
            tannerCar.accelerate(tannerCar);
        }
        for (int i = 0; i < 3; i++){
            tannerCar.move(tannerCar);
        }
        for (int i = 0; i *5 < 25; i++){
            tannerCar.brake(tannerCar);
        }
        System.out.println(tannerCar);
        //check to see who drove the farthest (in code)
        if(davidCar.getdistanceTraveled() > distance){
            distance = davidCar.getdistanceTraveled();
            carName = davidCar.getOwner();
        }
        if(tannerCar.getdistanceTraveled() > distance){
            distance = tannerCar.getdistanceTraveled();
            carName = tannerCar.getOwner();
        }
        if(sherriCar.getdistanceTraveled() > distance){
            distance = sherriCar.getdistanceTraveled();
            carName = sherriCar.getOwner();
        }
        System.out.println(carName+"'s car moved " + distance + " miles, the farthest of all cars.");


        //output thes car that drove the farthest
        //Bonus: reset each car's distance traveled and speed, and drive them back to Kearney
        //Bonus: test the car's copy constructor
    }
}
