package Engine;

import java.util.Arrays;

public class AllAboutArrays {
	
	public static void main(String[] args)
	{
		
		int[] randomArray;
		
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		
		randomArray[1] = 2;
		
		String[] stringArray = {"Strings", "are", "awesome"};
		// ^^^ 3 items in this array
		
		//Arrays through loops:
		
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = i;
		}
		
		// ^^^ Another way to add values to an array
		
		int k = 1;
		while (k <= 41){ System.out.println('-'); k++; }
		System.out.println();
		
		for(int j = 0; j < numberArray.length; j++)
		{
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		
		// an array is a variable that can hold a whole bunch of different variables,
		// Kind of like a bunch of boxes with variables within a big box
		// Each box has an index value, used to find the variable within it.
		// An array is an object
		// Every single array can only have one type of data inside of it.
		// An array has a fixed size and can't be changed once declared.
				
	}
	
}
