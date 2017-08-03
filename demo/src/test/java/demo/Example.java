package demo;

class D
{
	int Acc_NO;
	String Acc_Name;
	String Acc_Type;
	float f_Sal;
	String Addr;
// Zero args constructor	
	D()
	{
		this.Acc_NO=123;
		this.Acc_Name="QA Planet";
		this.Acc_Type ="Savings";
		this.f_Sal=70000.0f;
		this.Addr="Hyd";
	}
	
	void accountDetails()
	{
		System.out.println("Account Details of Qaplanet");
		System.out.println("===========================");
		System.out.println("Account Num    : "+ Acc_NO);
		System.out.println("Account Name   : "+ Acc_Name);
		System.out.println("Account Type   : "+ Acc_Type);
		System.out.println("Account Salary : "+ f_Sal);
		System.out.println("Account Address: "+ Addr);
	}
}

public class Example {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.accountDetails();
		
		
	}

}
