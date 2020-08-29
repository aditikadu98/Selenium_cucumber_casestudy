package day1;

import java.util.Scanner;

public class DataType2 {

	public static void main(String[] args) {
		byte b =100; // -128 to 127 or 0 to 256
		short s=32767;
		
Scanner scan =new Scanner (System.in);

System.out.println("Enter the byte value");
b=scan.nextByte();

System.out.println("Enter the short value");
s=scan.nextShort();
System.out.println("Byte value is = " + b);
System.out.println("Short value is = " + s);

	}

}
