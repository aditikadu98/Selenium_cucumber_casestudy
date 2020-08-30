package day2;

/*
 * Demo of For Loop
 * Any loop- the purpose of looping is to repeat specific actions
 * Accept your name and welcome you for 10 -times
 * syntax-- for(initial value; no of iterations/end value ; increment value)
 */

import java.util.Scanner;

public class ForLoopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you name");
		name=s.next();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Welcome " + name +" !!! " + i );
		}
		
		System.out.println("************************");
		System.out.println("************************");
		
		for(int i=10;i>=0;i--)
		{
			System.out.println("Welcome " + name +" !!! " + i );
		}

	}

}