package Engine;

public class Conditions 
{
	
	public static void main(String[] args)
	{
		
		int randomNumber = (int) (Math.random() * 5);
		
		System.out.println(randomNumber);
			
		if (randomNumber <= 2)
		{
			System.out.println("This number is less than 2!");
		}
		
		else if (randomNumber == 4)
		{
			System.out.println("Wow!, you've got a 4!");
		}
	}
	
}
