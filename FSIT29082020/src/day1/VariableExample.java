package day1;
/*
 * this program demonstrate the usage of variable 
 * local 
 * instance
 * static
 */
public class VariableExample {
static String empOrg="jigsaw";
int empId=100; //instance specific variable /class level

    float displaySal() {
	float sal=1000f;   //local variable
	return sal;
}

	public static void main(String[] args) {
		
		VariableExample v=new VariableExample ();
		System.out.println("Instance variable value= " + v.empId);
		System.out.println("static variable =" +empOrg);
		System.out.println("The local variable value is sal= "  + v.displaySal());
		
	}

}
