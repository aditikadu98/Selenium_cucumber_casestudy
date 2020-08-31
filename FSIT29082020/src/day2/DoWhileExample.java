package day2;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;

		do
		{
			int col=1;
			do 
			{
				System.out.print(col);
				col++;
			}while(col<=row);
		System.out.println();
		row++; //define incremental value otherwise while will enter into infinite loop
		
		}while(row <= 9);
	}

}