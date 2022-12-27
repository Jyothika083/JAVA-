import java.util.Scanner;
class Account
{
	String cust_name;
	String accno;
	String type;
	double balance;
	void get_values(String cname,String acc,String typ,double bal)
	{
		cust_name=cname;
		accno=acc;
		type=typ;
		balance=bal;
	}
}
class Cur_acct extends Account
{
	Cur_acct()
	{
		type="Current_account";
	}
	void depo(double amt)
	{
		balance+=amt;
	}
	
	void display_bal()
	{
		if(balance<1000)
		{
			balance=balance-100;
		}
		System.out.println("Balance="+balance);
	}
	void withdraw(int amt)
	{
		balance-=amt;
	}
}
class Sav_acct extends Account
{
	Sav_acct()
	{
		type="Savings_account";
	}
	void depo(double amt)
	{
		balance+=amt;
	}
	void display_bal()
	{
		if(balance<1000)
		{
			balance=balance-100;
		}
		System.out.println("Balance="+balance);
	}
	void withdraw(int amt)
	{
		balance-=amt;
	}
	void interest(double r,double t,double n)
	{	
		balance=balance*(math.pow((1+r/n),(n*t)));
	}
}
class Bank
{
	public static void main(string args[])
	{
		Scanner sc=new Scanner(System.in);
		char type;
		System.out.println("Enter the type of account you want to create, s for saving ");
		type=sc.nextChar();
		if(type==
