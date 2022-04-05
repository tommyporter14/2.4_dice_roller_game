import java.util.Scanner;

public class dice_roller {
		
	public static void main(String[] args) {
	
	int min = 1;
	char decision;
	int rollNumber = 1;
	int userInput = 0;
	
	Scanner	scnr = new Scanner(System.in);

	System.out.println("Welcome to my dice roll game!"
			+"\n - For craps game enter 6 for how many sides the die should have"
			+"\n - 1 and 1 is Snake Eyes"
			+"\n - 6 and 6 is Box Cars"
			+"\n - On a players first turn a 2, 3, or 12 total is a Crap Out/Pass Dice");
	/*I don't actually know the rules for Craps so sorry if this is incorrect. I tried to learn it 
	 * on google but it seems more involved than I thought. A lot of the rules seem to depend on the bet 
	 * you made as well as the person shooting/number of their roll. Anyways this is the best I could come 
	 * up with in without having to read too much about the game.*/
	
	System.out.println("How many sides should each die have? (Enter positive integer)");
	
		do
		{

			if (scnr.hasNextInt())
			{
				userInput = scnr.nextInt();
		
				do {
					
					int randomOne = (int)Math.floor(Math.random() * (userInput - min + 1) + min);
					
					int randomTwo = (int)Math.floor(Math.random() * (userInput - min + 1) + min);
					
					System.out.println("Roll " + rollNumber + " Results:");
					
					System.out.println(randomOne);
					
					System.out.println(randomTwo);
					
					int total = randomOne + randomTwo;
					
						if (rollNumber == 1 && (total == 2 || total == 3 || total == 12))
						{
							System.out.println("You rolled Crap Out! " + total);
						}
						else if (randomOne == 1 && randomTwo == 1)
						{
							System.out.println("You rolled Snake Eyes! " + total);
						}
						else if (randomOne == 6 && randomTwo == 6)
						{
							System.out.println("You rolled Box Cars! " + total);
						}
						else
						{
							System.out.println("You rolled a " + total);
						}
						
					rollNumber++;
							
					System.out.println("Would you like to roll again? (y/n)");
					decision = scnr.next().charAt(0);
					
						if (decision == 'y' || decision == 'Y')
						{
							continue;
						}
						else
						{
							System.out.println("Thanks for playing! Goodbye!");
							break;
						}
						
					}while(true);
				
				break;
			
			}
			
			else
			{
				System.out.println("Invalid input, please enter positive integer.");
				scnr.next();
				continue;
			}
		
		}while (true);
	
	scnr.close();
	
	}

}
