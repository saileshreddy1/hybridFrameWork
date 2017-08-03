package test2;

abstract class A
{
	abstract void method1();
	
	abstract void method2();
}

class B extends A
{
	public static Object b;
	void method1() 
	{
		System.out.println("Method-1");
	}
	void method2() 
	{
		System.out.println("Method-2");
	}
	void m3()
	{
		System.out.println("B-M3");
	}
}

public class Test 
{
	
	public static void main(String[] args) 
	{
		A a=new B();
		a.method1();
		a.method2();
		B b=new B();
		b.method1();
		b.method2();
		b.m3();
	}

}
