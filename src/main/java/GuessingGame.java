public class GuessingGame {
 
  public static void main(String[] args) {
    // Your amazing code goes here...

		String name;
		int max_number;
		int randomNumber;
		int guessedNumber;
		int count=0;
		
		Jar jar = new Jar("");
				
		System.out.printf("ADMINITRATOR SETUP %n**************************%n");
	  System.out.printf("What type of item: ");
		name = jar.getItemName();
		
    System.out.printf("What is the maximum amount of %s: ", name);
		max_number = jar.getItemNumber();
		System.out.println("");

		System.out.printf("PLAYER %n**************************%n");
		System.out.printf("The maximum number of %s in the jar is %d. %n", name,max_number);
		
		randomNumber = jar.fill(max_number);
		//System.out.printf("The random number is %d.%n", randomNumber);
		
		do{
			System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", name,max_number);
			guessedNumber = jar.applyGuess();
			count++;
		}	while (!jar.isWon(guessedNumber, randomNumber));
	  System.out.printf("You got it in %d attempt(s). %n",count);
			
	}
}
