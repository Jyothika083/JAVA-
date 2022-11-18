import java.util.*;
import java.math.*;
class Discriminant
{
	double a,b,c;
	Discriminant(double x,double y,double z)
	{
		a=x;
		b=y;
		c=z;
	}
	double discr()
	{
		return(b*b-4*a*c);
	}
}
class Quadratic
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		double r1,r2;
		System.out.println("Enter the coefficient of x^2");
		a=sc.nextDouble();
		System.out.println("Enter the coefficient of x");
		b=sc.nextDouble();
		System.out.println("Enter the constant");
		c=sc.nextDouble();
		if(a==0)
		{
			System.out.println("Entered equation is not quadratic!!!!");
		}
		else
		{
			Discriminant d=new Discriminant(a,b,c);
			if (d.discr()>0)
			{
				r1=(-b+Math.sqrt(d.discr()))/(2*a);
				r2=(-b-Math.sqrt(d.discr()))/(2*a);
				System.out.println("Roots are Distinct and real: r1="+r1+" r2="+r2);
			}
			else if(d.discr()<0)
			{
				r1=-b/(2*a);
				r2=(Math.sqrt(Math.abs(d.discr())))/(2*a);
				System.out.println("Roots are complex : r1= "+r1+"+i"+r2+" r2="+r1+"-i"+r2);
			}
			else
			{
				r1=-b/(2*a);
				System.out.println("Roots are equal: r1=r2="+r1);
			}
		}
	}
}