package demo;
class B
{
	static int i=10;
	int j=10;
}
public class Test2 {

	public static void main(String[] args) {
	
		B b=new B();
		
		System.out.println(	 b.i 	+"=========="+  	b.j);
		System.out.println(++b.i 	+"=========="+ 	  ++b.j);
		System.out.println(  b.i 	+"=========="+  	b.j);
		System.out.println(++b.i  	+"=========="+ 	  ++b.j);
		System.out.println(  b.i 	+"=========="+      b.j);
		
		B b1=new B();
		System.out.println(  b1.i 	+"=========="+	 	 b1.j);
		System.out.println(++b1.i 	+"=========="+     ++b1.j);
		System.out.println(  b1.i 	+"=========="+  	 b1.j);
		System.out.println(++b1.i 	+"=========="+ 	   ++b1.j);
		System.out.println(  b1.i 	+"=========="+       b1.j);
		
		B b2=new B();
		
		System.out.println(  b2.i 	+"=========="+      b2.j);
		System.out.println(++b2.i  	+"=========="+ 	  ++b2.j);
		System.out.println(  b2.i 	+"=========="+      b2.j);
		System.out.println(++b2.i  	+"=========="+ 	  ++b2.j);
		System.out.println(  b2.i   +"=========="+      b2.j);
	}

}
