package Main;
import java.util.Scanner;
import CIE.Internals;
import SEE.External;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        Internals[] inter =new Internals[n];
        External[] exter =new External[n];
        for(i=0;i<n;i++)
        {
            inter[i]=new Internals();
            exter[i]=new External();
            System.out.println("Enter the details of "+(i+1)+" Student");
            System.out.println("Enter usn:");
            inter[i].usn=sc.next();
            exter[i].usn=inter[i].usn;
            System.out.println("Enter name:");
            inter[i].name=sc.next();
            exter[i].name=inter[i].name;
            System.out.println("Enter sem:");
            inter[i].sem=sc.nextInt();
            exter[i].sem=inter[i].sem;
            System.out.println("Enter internal and external marks");
            for(j=0;j<5;j++)
            {
                inter[i].marks[j]=sc.nextInt();
                exter[i].marks[j]=sc.nextInt();
            }
        }
        System.out.println("\nDetails \n");
        for(i=0;i<n;i++)
        {
            System.out.println("usn :"+inter[i].usn);
            System.out.println("name :"+inter[i].name);
            System.out.println("sem :"+inter[i].sem);
            for(j=0;j<5;j++)
            {
                System.out.println("\t"+(inter[i].marks[j]+exter[i].marks[j]/2)+"\t");
            }
        }
    }
}