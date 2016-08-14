package Engine;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> MyGrade10Grades = new
		ArrayList<Integer>();
		MyGrade10Grades.add(100);
		MyGrade10Grades.add(98);
		MyGrade10Grades.add(97);
		MyGrade10Grades.add(100);
		MyGrade10Grades.add(0, 99);
		System.out.println(MyGrade10Grades.get(0));
		
		for (int j = 0; j < MyGrade10Grades.size(); j++)
		{
			System.out.println(MyGrade10Grades.get(j));
		}
		
		// ^^^ Normal for loop iteration over the list 
		
		for (Integer grades: MyGrade10Grades)
		{
			System.out.println(grades);
		}
		
		// Faster for loop iteration over the list. Called "For each loop"
	}

}
