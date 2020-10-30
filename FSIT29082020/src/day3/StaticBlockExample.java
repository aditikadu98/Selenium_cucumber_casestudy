package day3;

public class StaticBlockExample {
static int data;
static {
	data=100;
	System.out.println(data);
}
static {
	data=200;
	System.out.println(data);
}
	public static void main(String[] args) {
		System.out.println("this is ans "+data);

	}

}
