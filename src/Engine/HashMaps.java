package Engine;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args)
	{
		HashMap<String, Integer> myBusiness = new
		HashMap<String, Integer>();
		myBusiness.put("week 1", 5000);
		myBusiness.put("week 2", 10000);
		myBusiness.put("week 3", 70-00);
		myBusiness.put("week 4", 17000);
		myBusiness.put("week 5", 25000);
		System.out.println(myBusiness.get("week 1"));
		// How to print a certain Key and associated Value
		System.out.println(myBusiness.size() + " weeks!");
		// Prints out how many key and value pairs there are
		for (String weeks : myBusiness.keySet())
		{
			System.out.println("In " + weeks + " we made " + myBusiness.get(weeks) + " dollars!");
		}
	}

}
