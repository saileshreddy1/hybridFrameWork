package demo;

class BankDefaultInterest
{
	float getInterest()
	{
		System.out.println("Default Interest per annaum");
		return 4.5f;
	}
}

class BankGoaldLoanInterest extends BankDefaultInterest
{
	float getInterest()
	{
		System.out.println("Gold Loan Interest per annaum");
		return 7.5f;
	}
}

class StudyLoanInterest extends BankGoaldLoanInterest
{
	float getInterest()
	{
		System.out.println("Study Loan Interest per annaum");
		return 9.0f;
	}
}

class KarifLoanInterest extends StudyLoanInterest
{
	float getInterest()
	{
		System.out.println("Karif Loan Interest rate annaum");
		return 12.5f;
	}
}


public class MethodOverriding {

	/*
	
 	public static final void main(String[] args)
	
	public static void main(String... args)
	
	public static void main(String args[])
	
	static public void main(String qaplanet[])
	
	public static void main(String []args)
	
	public static synchronized void main(String... args)
	
	public static strictfp void main(String... args)
	
	*/
	
	public static final void main(String[] args)
	{
		
//		BankDefaultInterest BankDefaultInterest = new BankDefaultInterest();
//		System.out.println(BankDefaultInterest.getInterest());
//		
//		BankDefaultInterest gold=new BankGoaldLoanInterest();
//		System.out.println(gold.getInterest());
//		
//		BankDefaultInterest study=new StudyLoanInterest();
//		System.out.println(study.getInterest());

		BankDefaultInterest karif=new KarifLoanInterest();
		System.out.println(karif.getInterest());
	}
	
}
