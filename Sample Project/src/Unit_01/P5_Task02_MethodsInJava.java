package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String args[]) {
		
		ABC3 obj = new ABC3();
		
		//Calling display method definition
		obj.display();
		System.out.println(obj.a);
		
	}
}

class ABC3 {
	
	static int a = 10;
	
	/* Actual method definition
	 * 
	 * DataType methodName(DataType2 p1, DataType2 p2) {
	 * 		methodBody;
	 * 		return value; //if required
	 * }
	 * 
	 */
	
	static void display() {
		
		int a = 10;
		int b = 10;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	int display2() {
		
		System.out.println(a);
		//	As a was a local variable so we cannot access it outside the method;
		//System.out.println(b);
		
		return a;
	}
}