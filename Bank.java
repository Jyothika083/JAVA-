import java.util.*;
class Account
{
	String cust_name;
	String accno;
	String type;
	double balance;
}
class Cur_acct extends Account
{
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
		balance=balance*(math.pow(1+r/n)