public class HarryPotterRunner {
	// Create a HarryRunner class with a main method that:
	// 1. makes harry potter

	public static void main(String[] args) {	
	HarryPotter arrey = new HarryPotter();
	// 2. become invisible
	arrey.makeInvisible(true);
	// 3. spy on Professor Snape
	arrey.spyOnSnape();
	// 4. become visible again
	arrey.makeInvisible(false);
	// 5. cast a “stupefy” spell
	arrey.castSpell("stupefy");
}
}