

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar LightningMcQueen = new RaceCar("Best", 5);
		// 2. Print the RaceCar's position in the race
System.out.println(LightningMcQueen.getPositionInRace());
		// 3. Crash the RaceCar
LightningMcQueen.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(LightningMcQueen.equals("isDamaged")) {
	LightningMcQueen.pit();
}
		// 5. Help the car move into first place.
for (int i = 0; i < 8; i++) {
LightningMcQueen.overtake();
}
}
}
