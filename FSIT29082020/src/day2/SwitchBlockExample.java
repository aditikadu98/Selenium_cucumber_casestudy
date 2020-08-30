package day2;
import java.util.Scanner;

/*
 *Demo of Switch Block
 *syntax switch(variable)
 *		{
 *			case 1;
 *          case 2:
 *          default:
 *		} 
 * Accept the week day in number (1,2,3..7) from the user in a variable called day.
 * Monday=1
 * Tuesday=2
 * Wednesday=3......
 * Sunday=7 if the user enters any other value say invalid day value.
 */

public class SwitchBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int day;
			Scanner s = new Scanner(System.in);
			int count=0;
			
			while(count==0)
			{
			
			System.out.println("Enter the day number");
			day=s.nextInt();

            switch(day)
            {
            case 1: System.out.println("Monday");
            		break;
            		
            case 2: System.out.println("Tuesday");
    				break;
    
            case 3: System.out.println("Wednesday");
					break;

            case 4: System.out.println("Thursday");
					break;

            case 5: System.out.println("Friday");
					break;

            case 6: System.out.println("Saturday");
					break;
            case 7: System.out.println("Sunday");
					break;
			default:
					System.out.println("Invalid Input");
			

            }
            System.out.println("If you want to continue press 0 or press 1");
    		count=s.nextInt();
			}
           
	}

}