package Engine;

import java.util.Scanner;
import java.util.*;

public class Basics 
{
	
	static float my_float = 3.142F;
	
	public static final double FAVNUMBER = 1.6180; // <---- Field, anything in a class
	
	private String my_ting = "This is Lit";
	private int my_integer = 77;
	private boolean TorF = true;
	private byte Litness = 34;
	private long verryyyyylong = 3124133;
	private char justoneletter = 'A';
	private double lotsofdecimals = 1.618022;
	private float justusedoubles = 1;
	
	protected static int numberofAnimals = 0;   // <-- Data type that can only be accessed by other code inside of the same package(Engine)
	
	static Scanner userinput = new Scanner(System.in); // <-- How to get user input!
	

	
	
	
	public Basics()
	{
		
		int thisislit = 6 + 1;
		System.out.println("The lit most number: " + thisislit);
		
	}
	
	public static void main(String[] args) 
	{
		
		Basics thebasics = new Basics();
		
		int my_int = 777;
		
		String my_string = "This is Lit";
		
		String bigger_string = "wow";
		
		String litness = my_string + ' ' + bigger_string;
		
		System.out.println(litness);

	}

}
