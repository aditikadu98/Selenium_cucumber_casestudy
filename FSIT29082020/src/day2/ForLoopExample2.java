package day2;
/*
 * pattern problems in java using Nested For
 * 1                54321
 * 12                4321
 * 123                321
 * 1234                21 
 * 12345                1 
 * 123456
 */

public class ForLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=6;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	System.out.println("****************");
    System.out.println("****************");
	int counter=1;	
	//outer for loop	
	for(int row=0; row>=1; row--)
	{
		//inner for loop
		for(int col=row;col>=1;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	for(int i=1;i<=counter;i++)
	{
		System.out.print(" ");
	}
	counter++;
	
	}
	}

}