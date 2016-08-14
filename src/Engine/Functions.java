package Engine;

import java.util.Scanner;

public class Functions 
{
	
	static int randomNumber; // <-- Class Variable, available everywhere
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1)
		{
			System.out.println("Guess a number between 1 and 10: ");
			
			randomGuess = userInput.nextInt();
			
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Wow! You got it! " + randomGuess);
		
	}
	
	public static int getRandomNum () // <--- This is a Function/Method!
	{
		randomNumber = (int) (Math.random() * 11);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if(guess == getRandomNum())
		{
			return -1;
		} else {
			return guess;
		}
	}
}
