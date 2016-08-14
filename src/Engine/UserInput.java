package Engine;

import java.util.Scanner;

public class UserInput
{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int mynumber = 67;
		
		mynumber += 2;
		
		System.out.print("Your favourite number: ");
		
		if (userInput.hasNextInt())
		{
			
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered: " + numberEntered);
			
		}
		
	}
	
}
