package demo;

class C
{
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	static void add(String a,String b)
	{
		System.out.println(a+b);
	}
}

public class Sample {

	public static void main(String[] args) {
		
		C.add(10.0f, 20.0f);
		C.add(10, 20);
		C.add("Sailesh", " Dega");
	
	}

}
