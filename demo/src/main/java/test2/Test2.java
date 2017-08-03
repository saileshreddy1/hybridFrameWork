package test2;

interface I
{
	public static void m1() {
		System.out.println("Method 1");
	}
}
interface J extends I
{
	public void m2();
}

interface K extends J
{
	public void m3();
}

public class Test2 implements K{

	public static void main(String[] args) {

	Test2 tt=new Test2();
	
	tt.m2();
	tt.m3();
	}

	
	public void m2() {
	
		System.out.println("M2-Method");
	}

	
//	public static void  m1() {
//	
//		System.out.println("M1-Method");
//	}

	
	public void m3() {
	
		System.out.println("M3-Method");
	}

}
