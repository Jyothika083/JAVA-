import java.util.Scanner;
class WrongAge extends Exception
{
	private String detail;
	WrongAge(String a)
	{
		detail=a;
	}
	public String toString()
	{
		return "WrongAge [" +detail +"]";
	}
}
class Father
{
	int father_age;
	Father(int a)
	{
		father_age=a;
	}
}
class Son extends Father
{
	int son_age;
	Son(int a,int b)
	{
		super(a);
		son_age=b;
		try
		{
			if(son_age<=0 || father_age<=0)
			{
				throw new WrongAge("Son's age or Father's age is less than zero");
			}
			if(father_age<=son_age)
			{
				throw new WrongAge("Father's age is less than Son's age");
	 		}
			else
				System.out.println("Entered age is valid");
		}
		catch(WrongAge e)
		{
			System.out.println("Caught "+e);
		}
	}
}
class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Father's age and Son's age");
		int fa=sc.nextInt();
		int sa=sc.nextInt();
		Son ob=new Son(fa,sa);
	}
}
		