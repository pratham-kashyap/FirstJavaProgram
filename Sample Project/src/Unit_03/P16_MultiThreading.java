/*
Multiprocessing has three types-
1. Sequential 
2. Parallel
3. Concurrent

Similarly, Multitasking has three types-
1. Sequential
2. Parallel
3. Concurrent

-Identify dependant and non dependant task in respective process
-Insert selective task into threads
-Start those threads
*/
package Unit_03;

import java.util.Scanner;

public class P16_MultiThreading
{
	public static void main(String args[])
	{
//		C1 obj1 = new C1();
//		C2 obj2 = new C2();
//		obj1.show1();
//		obj2.show2();
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		t1.start();
		t2.start();
		t3.start();
	}
}
class C1
{
	void show1()
	{
		Scanner ob = new Scanner (System.in);
		int r = ob.nextInt();
		System.out.println(r);
		ob.close();
	}
}
class C2
{
	void show2()
	{
		for(int i = 0;i<10;i++)
			System.out.println("Hey-2");
	}
}
class T1 extends Thread
{
	public void run()
	{
		Scanner ob = new Scanner (System.in);
		int r = ob.nextInt();
		System.out.println(r);
		ob.close();
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(int i = 0;i<10;i++)
			System.out.println("Hey-2");
	}
}
//class T3 extends Thread
//{
//	public void run()
//	{
//		for(int i = 0;i<10;i++)
//			System.out.println("Hey-3");
//	}
//}
class T3 extends Thread
{
	public void run()
	{
		for(int i = 0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}