package day2;

import java.util.Scanner;

/*
 * Demo of single dimensional array
 * Read Array myArr[5] from user and display the values
 * initialize myArr1={12,23,45,67,23}
 * 
 */
public class SingleDimensionalArray {

static void display(int[] arr)
{
for(int i=0;i<arr.length;i++)	
System.out.println("Value of array at " + i + " is = " + arr[i]);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int myArr[]=new int[5]; //initialize array of length 5

int myArr1[]= {12,23,45,87,23,56,23,12,34,56};


//Read the MyArr values from the user
Scanner s = new Scanner(System.in);
for(int i=0;i<myArr.length;i++)
{
	System.out.println("Enter the index value " + i);
	myArr[i]=s.nextInt();
}

JavaMethodExample.drawLine();
display(myArr);
JavaMethodExample.drawLine();

display(myArr1);



	}

}
