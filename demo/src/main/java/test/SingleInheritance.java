package test;

class SuperClass1
{
	SuperClass1() 
	{
		System.out.println("Super class constructor");
	
	}
	void m1()
	{
		System.out.println("Super Class M1 method");
	}
	
	void m2()
	{
		System.out.println("super class m2 method");
	}
}

class SubClass1 extends SuperClass1
{
	SubClass1() 
	{
		System.out.println("Sub class constructor");
	
	}
	void m3()
	{
		System.out.println("Sub Class M1 method");
	}
	
	void m4()
	{
		System.out.println("sub class m2 method");
	}
}



public class SingleInheritance  extends SubClass1 {

	public static void main(String[] args) {
		
		SubClass1 sc=new SubClass1();
		SuperClass s=new SuperClass();
		sc.m1();
		sc.m2();
		
		s.m1();
		s.m2();
		
		

	}

}
