package day2;

/*
 * Nested while example
 * 1
 * 12
 * 123
 * 1234
 * 12345 
 */

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=1;

			while(row <= 5)
			{
				int col=1;
				while(col<=row)
				{
					System.out.print(col);
					col++;
				}
			System.out.println();
			row++; //define incremental value otherwise while will enter into infinite loop
			
			}
	}

}