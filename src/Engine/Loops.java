package Engine;

public class Loops 
{
	
	public static void main(String[] args)
	{
		
		int i = 1;
		
		while (i <= 10)
		{
			
			if (i == 3)
			{
				i+=2;
				continue;
			}
			
			System.out.println(i);
			i++;
	
			if (i%2 != 0)
			{
				i++;
			}
		}
		
		for (int l=10; l >= 1; l--)
		{
			System.out.println(l);
		}
		
	}
	
}
