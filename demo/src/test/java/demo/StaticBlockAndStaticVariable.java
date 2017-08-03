package demo;

class A
{
	static int add=add(10, 20);
	static 
	{
		
		System.out.println("sb");
		
	}
		
	{
		System.out.println("N-b");
	}
	
	static int add(int i,int j)
	{
		int z=i+j;
		System.out.println(z);
		return z;
	}
	
	
	String add()
	{
		System.out.println("add");
		String s = null;
		return s;
	}
	String a=add();
	static 
	{
		System.out.println("A-SB");
	}
	
}


public class StaticBlockAndStaticVariable {

	
	static public final void main(String[] args) {
		
		A a=new A();
		System.out.println(a);
		
		

	}

}
