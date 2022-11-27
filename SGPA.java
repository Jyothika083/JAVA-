import java.util.*;
class Student
{
    String USN;
    String name;
    int credits[]=new int[20];
    int c,tot,i;
    int marks[]=new int[20];
    int p[]=new int[20];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student's USN :");
        USN=sc.next();
        System.out.println("Enter student's name :");
        name=sc.next();
        System.out.println("Enter total number of courses :");
        c=sc.nextInt();
        System.out.println("Enter total number of credits :");
        tot=sc.nextInt();
        System.out.println("Enter credits :");
        for(i=0;i<c;i++)
        {
            System.out.println("Enter number of credits for course  "+(i+1));
            credits[i]=sc.nextInt();
        }
        System.out.println("Enter marks");
        for(i=0;i<c;i++)
        {
            System.out.println("Enter marks of course "+(i+1));
            marks[i]=sc.nextInt();
        }
    }
    double calculate()
    {
        
        for(i=0;i<c;i++)
        {
            if(marks[i]<=100 && marks[i]>=90)
                p[i]=10;
            else if(marks[i]<90 && marks[i]>=80)
                p[i]=9;
            else if(marks[i]<80 && marks[i]>=70)
                p[i]=8;
            else if(marks[i]<70 && marks[i]>=60)
                p[i]=7;
            else if(marks[i]<60 && marks[i]>=50)
                p[i]=6;
            else if(marks[i]<50 && marks[i]>=40)
                p[i]=4;
            else
                p[i]=0;
            
        }
        int total=0;
    
        
        for(i=0;i<c;i++)
        {
            total+=credits[i]*p[i];
        }
        return (total/tot);
    }   
    void printf()
    {
        System.out.println("USN :"+USN);
        System.out.println("Name :"+name);
        System.out.println("SGPA :"+calculate());
    }

}
class SGPA
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.input();   
        s1.printf();
    
    }
}