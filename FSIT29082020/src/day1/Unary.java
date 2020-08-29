package day1;

import java.util.Scanner;

/*
 * demo of unary operator 
 * ++ , --
 * this is also called as pre increment or decrement
 * or post increment or post decrement
 * in case of pre incre /dec value will be incre/ decre the new value will be availabe on same line 
 * in case of post incre /dec value will be incre/ decre the new value will be availabe on next  line 
 */
public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner (System.in);
		System.out.println("enter the value");
		a=s.nextInt();
		
		System.out.println("post inc =" + a++);//a=a+1---->a=11.......increment value will be available on next line
		System.out.println("pre inc=" + ++a);//a=a+1---->a=11.......increment value will be available /a=a+1---->a=11.......increment value will be available on same line
		System.out.println("post dec =" + a--);
		System.out.println("pre dec =" + --a);
		
		
		

	}

}
