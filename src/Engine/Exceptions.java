package Engine;

public class Exceptions 
{
	
	// Exceptions are objects that appear when an error occurs 
	// 2 main Exception are:
	// java.lang.RunTimeException
	// java.lang.Exception
	// ArithmeticException <-- When a math problem occurs (something / 0)
	// ClassNotFoundException <-- When an unidentified class is referenced
	// IllegalArgumentException <-- When a method is passed in an illegal argument
	// IndexOutOfBounds <-- When trying to access and index or array or string that does'nt exist
	// InputMismatchException <-- When the wrong data type is entered
	// IOException <-- When any IO related exception is made
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println(5/0);
		}

		
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
