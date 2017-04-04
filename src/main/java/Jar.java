import java.util.Scanner;
import java.util.Random;

class Jar {
	public String itemName;
	public int itemNumber;
	
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
		
	public Jar (String itemName){
		this.itemName = itemName;
	}
	
	public Jar (int itemNumber){
		this.itemNumber = itemNumber;
	}
	
  public String getItemName() {
		String itemName = sc.nextLine();
		return itemName;
	}	
	public int getItemNumber(){
		int itemNumber = sc.nextInt();
		return itemNumber;
	} 
	public int fill(int max_number){	
		int someNumber = random.nextInt(max_number);
		while (random.nextInt(max_number) == 0){
			someNumber = random.nextInt(max_number);
		}
		return someNumber;		
	}
	public int applyGuess(){
		int guess = sc.nextInt();
		return guess;
	}
	public boolean isWon(int guessedNumber, int randomNumber){
		return guessedNumber == randomNumber;
	}
}

