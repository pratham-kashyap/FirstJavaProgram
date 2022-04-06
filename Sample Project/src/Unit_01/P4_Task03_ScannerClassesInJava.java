package Unit_01;

import java.util.Scanner;

/*	
 * 	When User takes input from Console...
 *	- next()			Read next token from the input entered by the user
 *	- nextLine()		Read user input (to read String)
 *	- nextBoolean		Reads a boolean value from the user
 *	- next().charAt(0)	Reads a character value from the user
 *	- nextByte()		Reads a byte value from the user
 *  - nextInt()			Reads an integer value from the user
 *  - nextLong()		Reads a long integer value from the user
 *  - nextShort()		Reads a short integer value from the user
 *  - nextFloat()		Reads a float value from the user
 *  - nextDouble()		Reads a double value from the user
 * 
 */

public class P4_Task03_ScannerClassesInJava {

	public static void main(String args[]) {
		
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		
		//Read the First Token (Till first space bar is encountered)
		String firstName = myObj1.next();
		System.out.println("Name is: "+firstName+"\n");
		
		String name1 = myObj2.nextLine();	//(\n)
		String name2 = myObj2.nextLine();	//(\n)
		
		System.out.println("Name is: "+name1+"\n");
		System.out.println("Name is: "+name2+"\n");
		
		boolean b = myObj2.nextBoolean();
		System.out.println(b+"\n");
		
		myObj1.close();
		myObj2.close();
		
	}
}
