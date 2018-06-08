

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar marioKart = new RaceCar("Mario Mators",5);
		// 2. Print the RaceCar's position in the race
System.out.println("5th place");
		// 3. Crash the RaceCar
		marioKart.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(marioKart.damaged) {
	marioKart.pit();
}
		// 5. Help the car move into first place.
for(int i = marioKart.getPositionInRace();i>0;i--) {
	marioKart.overtake();
}
	}
}
