package day1;
/*
 * demo of logical operator
 * && and --------> compare two , returns true if all condition true
 * || or --------> compare two, returns true if any one is true
 * ! not --------> if condition is true it will return false
 */
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner s= new Scanner (System.in);

		System.out.println("enter 1st num: ");
		num1 = s.nextInt();
		System.out.println("enter 2nd num: ");
		num2 = s.nextInt();
		System.out.println("enter 3rd num: ");
		num3 = s.nextInt();
		s.close();
		
		System.out.println("&& comparison =" +((num1>num2)&&(num1<num2)&&(num2<num3)));
		System.out.println("|| comparison =" +((num1>num2)||(num1<num2)||(num2<num3)));
		System.out.println("! comparison =" + !(num1>num2));
	}

}
