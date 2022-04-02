package Unit_01;

/* 
 * Keywords can't be used as functions
 * Keywords can't be used as objects
 * Keywords can't be used as variable name
 * Keywords can't be used as class
 * Never make function inside the function
 */

public class P2_Task01_KeywordsInJava {
 
	public static void main(String[] args) {
		final int a =5;
		//int new();
		
		System.out.println(a);
		
		//Syntax error on token "double", invalid VariableDeclaratorId
		//int double = 10;
		
		//new is a keyword so can't be used as function name
	
	/*
		  Multiple markers at this line
		- ABC cannot be resolved to a 
		 variable
		- Syntax error on token "int", delete 
		 this token
	*/
	//ABC int = new ABC();
	new ABC();
	//System.out.print(ob);
	func();
}
	
	static int func() {
		return 2;
	}
		/*class new{
		 void display() {
		 
		 }
		 }*/
}
class ABC{
	void display() {
		}
	}
