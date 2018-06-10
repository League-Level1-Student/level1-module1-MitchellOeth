
public class CatRunner {
	public static void main(String[] args) {
		
		
		// Create a CatRunner class with a main method that creates a Cat object.
Cat meow = new Cat("meow");
        // 1. Make the Cat meow
		meow.meow();
		// 2. Get the Cat to print it's name
meow.printName();
		// 3. Kill the Cat!
for (int i = 0; i < 9; i++) {
meow.kill();
	}
	}
}
