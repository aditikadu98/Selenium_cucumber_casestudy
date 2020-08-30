package day2;

import java.util.Scanner;

/*
 * Demo of joining multiple cases in switch block
 * if the day value is "Mon", "Wed","Fri" say you can buy movie tickets
 * else if the day value falls on "Tue","Thu","Sat",& "Sun" then say you cannot buy on these days
 * Otherwise say invalid day 
 */

public class SwitchBlockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		Scanner s = new Scanner(System.in);
		int count=0;
		
		while(count==0)
		{
		System.out.println("Enter the week day");
		day=s.next();
		
		switch(day)
		{
		case "Mon" :
		case "Wed":
		case "Fri":	System.out.println("You are allowed to buy movie tickets on " + day);
					break;
		case "Tue":
		case "Thu":
		case "Sat":
		case "Sun": System.out.println("You are not allowed to buy movie tickets on " +day);
					break;
					
		default: System.out.println("Invalid day");
		}
		System.out.println("If you want to continue press 0 or press 1");
		count=s.nextInt();
		}
		
	}

}
