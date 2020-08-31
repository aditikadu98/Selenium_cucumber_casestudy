package day2;

import java.util.Scanner;

public class JavaMethodExample {

  public static void drawLine()
  {
	  System.out.println("***********************");
  }
  
  int addition(int a, int b)
  {
	
	  return a+b;
  }
  
  static int subtraction(int a, int b)
  {
	  return a-b;
  }
  float product (float a, float b)
  {
	  return a*b;
  }
	
  static void division(float a, float b)
  {
	  System.out.println("Division is = " + a/b);
  }
  
  int modulus(int a, int b)
  {
	  return a%b;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		float num3,num4;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1");
		num1=s.nextInt();
		System.out.println("Enter num2");
		num2=s.nextInt();
		System.out.println("Enter num3");
		num3=s.nextFloat();
		System.out.println("Enter num4");
		num4=s.nextFloat();
		
		drawLine();
		
		JavaMethodExample j=new JavaMethodExample();
		System.out.println("Addition is " + j.addition(num1,num2));
		
		drawLine();
		System.out.println("Subtraction is " + subtraction(num1,num2));
		drawLine();
		System.out.println("Product is " + j.product(num3,num4));
		drawLine();
		division(num3,num4);
		drawLine();
		System.out.println("Modulus is " + j.modulus(num1,num2));
		drawLine();
	}

}