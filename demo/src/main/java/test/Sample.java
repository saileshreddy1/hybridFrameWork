package test;

public class Sample {

	Sample()
	{
		System.out.println("constructor");
	}
	
	int i=10;
	static
	{
		System.out.println("Sample class static block");
		
	}
	
	static
	{
		
		System.out.println("Sample class static block 2");
	}
	
	
	{
//		System.out.println(i);
		System.out.println("Sample class not-static block");
	}
	public static void main(String[] args) {
		
		Sample s=new Sample();
		System.out.println(s);
		
//		System.out.println(s);
		Sample s2=new Sample();
		System.out.println(s2);
//		new Sample();
//		new Sample();
//		new Sample();
//		new Sample();
		
	}

}
