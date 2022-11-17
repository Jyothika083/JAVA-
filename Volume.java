import java.util.*;
class Box
{
	int l, b, h;
	int volume()
	{
		return(l*b*h);
	}
}
class Boxdemo
{
	public static void main(String args[])
	{
		Box ob=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length, breadth and height :");
		ob.l=sc.nextInt();
		ob.b=sc.nextInt();
		ob.h=sc.nextInt();
		System.out.println("Volume of the box = "+ob.volume());
	}
}
		
	