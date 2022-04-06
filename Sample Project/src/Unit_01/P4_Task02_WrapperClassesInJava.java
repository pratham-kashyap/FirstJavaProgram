package Unit_01;

/*
 *	The Wrapper Class in Java provides the mechanism to convert primitive into object and objects to String.
 *	Why?
 *	Because we want to use predefined methods of those objects
 *	- boolean data types -> Boolean obj -> obj.toString();
 *
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String args[]) {
		
		//Converting int into Integer
		int a = 20;
		
		String s = ""+a+"";
		
		Integer i = Integer.valueOf(a);	// Converting int into Integer explicitly
		Integer j = a;					// Autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a+" "+i+" "+j);
		System.out.println(i.toString());
		
		//a.toString() can not be done as a is int and not an object
		//Autoboxing: Converting primitives into objects
		
		byte b = 10;
		Byte byteobj = b;
		
		System.out.println(byteobj);
		
		//Unboxing: Converting objects to primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);
		
	}
}
