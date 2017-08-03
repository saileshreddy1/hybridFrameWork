package demo;

public class EvenorOdd {

	public static void main(String[] args) {
		int i=10;
		int r=EvenorOdd.Check(i);
		
		if(r==1)
		{
			System.out.println(r);
			System.out.println("Even Number");
		}
		else
		{
			System.out.println(r);
			System.out.println("Odd Number");
		}

	}

	private static int Check(int num) {
		 if(num%2==0)
		 {
			 return 1;
		 }
		 else
		 {
		return 0;
		}
	}

}
