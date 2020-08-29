package day1;
/*
 * demo of assignment operator 
 * = , += , -= ,*= , /=
 */
public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp=10;
System.out.println(("+= "  +(temp+= 3))); //temp=temp +3 ---> temp=10+3=13
System.out.println(("-= "  +(temp-= 3))); //temp=temp -3 ---> temp=13-3=10
System.out.println(("*= "  +(temp*= 3))); //temp=temp*3 --->temp =10*3=30
	}

}
