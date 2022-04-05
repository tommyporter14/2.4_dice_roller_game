import java.util.Scanner;//import scanner

public class dice_roller {//main method stuff auto created by eclipse
		
	public static void main(String[] args) {
	
	int min = 1;//variables
	char decision;
	int rollNumber = 1;
	int userInput = 0;
	
	Scanner	scnr = new Scanner(System.in);//assign scnr as user input

	System.out.println("Welcome to my dice roll game!"//prints first message and rules for craps to user
			+"\n - For craps game enter 6 for how many sides the die should have"
			+"\n - 1 and 1 is Snake Eyes"
			+"\n - 6 and 6 is Box Cars"
			+"\n - On a players first turn a 2, 3, or 12 total is a Crap Out/Pass Dice");
	/*I don't actually know the rules for Craps so sorry if this is incorrect. I tried to learn it 
	 * on google but it seems more involved than I thought. A lot of the rules seem to depend on the bet 
	 * you made as well as the person shooting/number of their roll. Anyways this is the best I could come 
	 * up with in without having to read too much about the game.*/
	
	System.out.println("How many sides should each die have? (Enter positive integer)");//asks for sides of dice
	
		do//loop start 1
		{
			if (scnr.hasNextInt())//checks if input is integer
			{
				userInput = scnr.nextInt();//if integer, assigns to userInput variable
					
				if(userInput > 0)//checks if integer is positive
					{
						
					}
				else//if not positive this is displayed and user re enters number
					{
						System.out.println("Invalid input, please enter positive integer.");
						continue;
					}
				
				do {//loop start 2
					
					int randomOne = (int)Math.floor(Math.random() * (userInput - min + 1) + min);//randomized roll 1
					
					int randomTwo = (int)Math.floor(Math.random() * (userInput - min + 1) + min);//randomized roll 2
					
					System.out.println("Roll " + rollNumber + " Results:");//shows what roll it is
					
					System.out.println(randomOne);//prints result roll 1
					
					System.out.println(randomTwo);//prints results roll 2
					
					int total = randomOne + randomTwo;//calculates total of both rolls
					
						if (rollNumber == 1 && (total == 2 || total == 3 || total == 12))//conditions for crap out
						{
							System.out.println("You rolled Crap Out! " + total);//print message plus total of rolls
						}
						else if (randomOne == 1 && randomTwo == 1)//condition for snake eyes
						{
							System.out.println("You rolled Snake Eyes! " + total);// print message plus total of rolls
						}
						else if (randomOne == 6 && randomTwo == 6)//condition for box cars
						{
							System.out.println("You rolled Box Cars! " + total);//prints message plug total of rolls
						}
						else
						{
							System.out.println("You rolled a " + total);//prints total of rolls
						}
						
					rollNumber++;//increments what roll we are on
							
					System.out.println("Would you like to roll again? (y/n)");//asks user if they want to roll again
					decision = scnr.next().charAt(0);//gets their decision
					
						if (decision == 'y' || decision == 'Y')//if y code loops
						{
							continue;
						}
						else//if anything but y code prints message below and breaks
						{
							System.out.println("Thanks for playing! Goodbye!");
							break;
						}
						
					}while(true);//end loop 2
				
				break;
			}
		
			else//if not integer message prints and user enters again
			{
				System.out.println("Invalid input, please enter positive integer.");
				scnr.next();
				continue;
			}
		
		}while (true);//end loop 1
	
	scnr.close();//scanner close
	
	}

}
