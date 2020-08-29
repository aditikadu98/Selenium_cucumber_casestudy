package day1;

import java.util.Scanner;

/*
 * this program demos th purpose of arithmetic operators
 *  +,-,*,/,%
 */
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
int num2;
Scanner s= new Scanner (System.in);

System.out.println("enter 1st num: ");
num1 = s.nextInt();
System.out.println("enter 2st num: ");
num2 = s.nextInt();
s.close();

System.out.println("addition is " +(num1+num2));
System.out.println("subb is " +(num1-num2));
System.out.println("product is " +(num1*num2));
System.out.println("quotient is " +(num1/num2));


	}

}
