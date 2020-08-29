package day1;

import java.util.Scanner;

/*
 * demo of if and else block 
 * accept the 4-digit number as year from the console
 * check year is leap year
 *  feb- 29 days then leap ---2020 is a leap yaer
 * (year % 400 ==0)  || (year%4==0) && (year%100) !=0))
 */
public class IfBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner scan =new Scanner (System.in);
year =scan .nextInt();

if((year % 400 ==0)  || (year%4==0) && (year%100 !=0))
{
	System.out.println("entered year is leap");
}
else
{
	System.out.println("entered year is not leap");
}
	}
}
