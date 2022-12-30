import java.util.Scanner;
class Account
{
	String cust_name;
	String accno;
	String type;
	double balance;
	double amt;
	Scanner sc=new Scanner(System.in);
	void get_values()
	{
		
		System.out.println("Enter customer name");
		cust_name=sc.next();
		System.out.println("Enter account number");
		accno=sc.next();
		System.out.println("Enter initial balance");
		balance=s.nextDouble();
	}
	void depo()
	{
		System.out.println("Enter amount to be deposited");
		amt=sc.nextDouble();
		balance+=amt;
	}
	void withdraw()
	{
		System.out.println("Enter amount to be withdrawn");
		amt=sc.nextDouble();
		if(balance<=amt)
			System.out.printl("Cannot withdraw");
		else
			balance-=amt;
		
	}
	void display_bal()
	{
		if(balance<1000)
		{
			balance=balance-100;
		}
		System.out.println("Balance="+balance);
	}
}
class Cur_acct extends Account
{
	Cur_acct()
	{
		type="Current_account";
	}
	
	
	
	
}
class Sav_acct extends Account
{
	Sav_acct()
	{
		type="Savings_account";
	}
	void interest()
	{	
		System.out.println("Enter rate of interest, time period and number of times interest is applied ");
		double r==sc.nextDouble();
		double t=sc.nextDouble();
		double n=sc.nextDouble();
		balance=balance*(math.pow((1+r/n),(n*t)));
	}
}
class Bank
{
	public static void main(string args[])
	{
		Scanner sc=new Scanner(System.in);
		char type;
		System.out.println("Enter the type of account you want to create, s for saving and c for current account");
		type=sc.nextChar();
		if(type=='s')
		{
			Sav_acct s1=new Sav_acct();
			s1.get_values();
			int c;
			
			while(true)
			{
				System.out.println("1.Deposit\n2.Display\n3.Withdraw\n4.Interest\n5.Exit");
				System.out.println("Enter your choice");
				c=sc.nextInt();
				switch(c)
				{
					case 1:s1.depo();
						break;
					case 2:s1.display_bal();
						break;
					case 3:s1.withdraw();
						break;
					case 4:s1.interest();
						break;
					default:System.exit(0);
				}
			}
		}
		else if(type=='c')
		{
			
			Curr_acct c1=new Curr_acct();
			c1.get_values();
			int c;
			
			while(true)
			{
				System.out.println("1.Deposit\n2.Display\n3.Withdraw\n4.Exit");
				System.out.println("Enter your choice");
				c=sc.nextInt();
				switch(c)
				{
					case 1:c1.depo();
						break;
					case 2:c1.display_bal();
						break;
					case 3:c1.withdraw();
						break;
					default:System.exit(0);
					
				}
			}
		}
		else
			System.out.println("Invalid choice");
	}
}
