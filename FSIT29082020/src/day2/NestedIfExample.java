package day2;

import java.util.Scanner;

/*
 * demo of nested if 
 * accept input the age and weight of person 
 * check if person age>= 18 && weight >=50 then eligible to donate blood otherwise no.
 */
public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age ;
		int weight;
		int count=0;
		
		Scanner s= new Scanner (System.in);
        while(count==0)
        {
		System.out.println("Enter  your age =");
		age = s.nextInt();
	
		if (age >=18)
		{
			System.out.println("Enter your weight : ");
			weight =s.nextInt();
			if (weight >=50)
			{
				System.out.println("eligible to donate blood ");
			}
			else
			{
				System.out.println("not eligible ...underweight");
			}
		}
		else
		{
			System.out.println("you are under age to donate");
		}
		System.out.println("to continue press 0");
		count=s.nextInt();
	}
	}
}


