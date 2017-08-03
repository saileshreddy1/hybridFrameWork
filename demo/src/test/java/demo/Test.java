package demo;

public class Test {

	static
	{
		Test t=new Test();
		System.out.println(t);
		Test.test();
	}
	static void test()
	{
		Test t=new Test();
		System.out.println(t);
		
	}
	
	
	public static void main(String[] args) {
		
		Test.test();
		
		main(new String[] {"a","b","c"});
	}

}
