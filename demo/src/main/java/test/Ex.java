package test;

public class Ex {

	static int j=10;
	int i=10;
	
	public static void main(String[] args) {

		
		Ex x=new Ex();
		
		System.out.println(x.j+"========="+x.i);
		
		System.out.println(x.j+++"========="+x.i++);
		
		System.out.println(x.j+"========="+x.i);
		
		Ex x1=new Ex();
		
		System.out.println(x1.j+"========="+x1.i);
		
		System.out.println(x1.j+++"========="+x1.i++);

		System.out.println(x1.j+"========="+x1.i);
	}

}
