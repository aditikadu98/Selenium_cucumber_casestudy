package day1;

import java.util.Scanner;

/*
 * Demos the purpose of If->Else if-> else block
 * Accept the score of a student from console
 * Declare the grade of the student
 * score >=0 && score<50 --- Fail
 * score >=50 && score < 70 - " C Grade"
 * score >=70 && score <90  - "B Grade"
 * Score >=90 && score <=100 "A Grade"
 * score not in the range of 0-100 then say "Invalid score"
 */

public class IfElseIfExample {

	public static void main(String[] args)
	{
		int score;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the score ");
		score=s.nextInt();
		if(score >=0 && score<50)
		{
			System.out.println("Fail");
		}
		else if(score >=50 && score < 70)
		{
			System.out.println("C Grade");
		}
		else if(score >=70 && score <90)
		{
			System.out.println("B Grade");
		}
		else if(score >=90 && score <=100)
		{
			System.out.println("A Grade");
		}
		else
		{
			System.out.println("Invalid Score");
		}
		
	}
}