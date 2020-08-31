package day2;

/*
 * Demo of Jagged Array
 * 
 * 20	30			first row has 2 cols
 * 23	54	45	87	second row has 4 cols
 * 97	12	45		third row has three cols
 */

import java.util.Scanner;

public class JaggedArrayExample {
	
	
	static void display(int[][] arr)
	{
	for(int i=0;i<arr.length;i++)
	{
	for(int j=0;j<arr[i].length;j++)
	{
	System.out.print(arr[i][j]+" ");	
	}
	System.out.println();
	}
	}
	
	static int[][] read()
	{
		int a[][]=new int[3][];
		a[0]=new int[2]; //initialize first row with 2 cols
		a[1]=new int[4]; //initialize second row with 4 cols
		a[2]=new int[3];
	
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=s.nextInt();
	}
	
	}
	return a;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][]; //initialize the jagged array

arr[0]=new int[2]; //initialize first row with 2 cols
arr[1]=new int[4]; //initialize second row with 4 cols
arr[2]=new int[3]; //initialize third row with 3 cols
	
	
	JavaMethodExample.drawLine();
	//Read values of Jagged array;
	
	arr=read();
	JavaMethodExample.drawLine();
	display(arr);
	JavaMethodExample.drawLine();
	
	}

}