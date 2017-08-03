package demo;
class E
{
	int Acc_NO;
	String Acc_Name;
	String Acc_Type;
	float f_Sal;
	String Addr;
// Zero args constructor	
	E(int AccNo, String AccName, String AccType, float sal, String Addr)
	{
		this.Acc_NO=AccNo;
		this.Acc_Name=AccName;
		this.Acc_Type =AccType;
		this.f_Sal=sal;
		this.Addr=Addr;
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
		System.out.println("");
	}
}

public class ArgsConstructor {

	public static void main(String[] args) {
		
		E e=new E(1234, "Sailesh Reddy", "Savings", 100000.0f, "HYD");
		e.accountDetails();		
		E e1=new E(1234, "abc", "Savings", 100000.0f, "HYD");
		e1.accountDetails();
	}
	
}
