package test2;

abstract class C
{
	public abstract void m1();
}

abstract class D extends C
{
	public int j;

	public abstract void m2();
}

abstract class E extends D
{
	int i;
	E(int i, int j)
	{
		this.i=i;
		super.j=j;
	}
	public abstract void m3();
}

abstract class F extends E
{
	F(int j) 
	{
		super(j, j);
	}

	public void m1() {
		 
		System.out.println("M1-Method");
	}

	public abstract void m2();
	public abstract void m3();
}

class G extends F
{
	G(int j) 
	{
	super(j);
	}

	public void m2()
	{
		System.out.println("M2-Method");
	}
	
	public void m3()
	{
		System.out.println("M3-Method");
	}
}

public class Sample2 {

	public static void main(String[] args) {
	
		G g=new G(10);
		g.m1();
		g.m2();
		g.m3();
		System.out.println(g.j);
		System.out.println(g.i);
	}

}
