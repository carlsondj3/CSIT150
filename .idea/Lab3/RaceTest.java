/**
 * RaceTest the Race class
 *
 * As you build the race class, uncomment more and more of the test code.
 * Written By Sherri Harms
 * Adapted By David Carlson 2018
 */
public class RaceTest {

    public static void main(String[] args) {

        Car sherriCar = new Car("Sherri", 85);
        Car labPartnerCar = new Car("Lab Partner", 100);
        Car yourCar = new Car("Willem Dafoe", 100);


            Race race = new Race();
			race.setDistance(500);
			race.addCar(sherriCar);
			race.addCar(labPartnerCar);
			race.addCar(yourCar);
			System.out.println("got this far");
			race.runRace();

			System.out.println("The results of the race is: ");
			System.out.println(race.toString());
			System.out.println("_______________________");

			// Second Race test statements:

			Race secondRace = new Race(); // a copy of the race - lets race with copies of the cars!
            secondRace.setDistance(500);
    		Car[] carsCopy = race.getCars();
			for (int i = 0; i < carsCopy.length; i++) {
				Car copy = carsCopy[i];
				copy.setMaxSpeed(copy.getMaxSpeed() * 2);  //first we will modify the cars, making them faster
				copy.setOwner(copy.getOwner()+" COPY");
				copy.resetCurrentSpeed();    //reset copy car engine
				copy.resetDistance();        //reset copy car distance to 0
				secondRace.addCar(copy);    //add the copy car to the race
				System.out.println("Copied car: " + copy);
			}

			Car anotherCar = new Car("Santa", 100);
			secondRace.addCar(anotherCar);
			System.out.println("Additional car: " + anotherCar);
			System.out.println("_______________________");

			// chedk winner at beginning of race
			System.out.println("Second race winner: " + secondRace.getWinner());
			System.out.println("_______________________");

			secondRace.runRace();

			System.out.println("The results of the second race is: ");
			System.out.println(secondRace.toString());
			System.out.println("_______________________");

			System.out.println("To verify that the second race did not change the cars in the first race.");
			Car[] carsInFirstRace = race.getCars();
			for (int i = 0; i < carsInFirstRace.length; i++) {
				System.out.println(carsInFirstRace[i].getOwner() + "\t" + carsInFirstRace[i].getdistanceTraveled());
			}
			System.out.println("_______________________");
			Car[] carsInSecondRace = secondRace.getCars();
			for (int i = 0; i < secondRace.getCarCount(); i++)
				System.out.println(carsInSecondRace[i].getOwner() + "\t" + carsInSecondRace[i].getdistanceTraveled());


			// BONUS ONLY TEST Bad Race test statements:
/*
			System.out.println("_______________________");
			Race thirdRace = new Race(-3); // test out our exception
			thirdRace.addCar(sherriCar);
			System.out.println("The status of the third race is: ");
			System.out.println(thirdRace.toString());
	*/
    }

}
