package test;
class SuperClass
{
	void m1()
	{
		System.out.println("SuperClass m1 method");
	}
	
	void m2()
	{
		System.out.println("SuperClass m2 method");
	}
}

class SubClass extends SuperClass
{
	void m3()
	{
		System.out.println("SubClass m3 method");
	}
	
	void m4()
	{
		System.out.println("SubClass m4 method");
	}
}



public class TestSample extends SubClass
{

	public static void main(String[] args) {

		
//		SubClass objSC=new SubClass();
//
//		SuperClass superclass=objSC;
//		
//		superclass.m1();
//		superclass.m2();
//		
//		objSC.m1();
//		objSC.m2();
//		objSC.m3();
//		objSC.m4();
		
		
//		SubClass subclass=(SubClass) new SuperClass();
//		subclass.m1();
//		subclass.m2();
//		subclass.m3();
//		subclass.m4();
//		
	
		SuperClass sc=new SubClass();
		
		sc.m1();
		sc.m2();
		
		}

}
