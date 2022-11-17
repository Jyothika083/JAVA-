import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
while(n!=1)
{
fact=fact*n;
n=n-1;
}
System.out.println("Factorial =" +fact);
}
}