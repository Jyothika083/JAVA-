import java.util.*;
abstract class Shape
{
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    void get_data(int l,int h)
    {
        a=l;
        b=h;
    }
    void printArea()
    {
        System.out.println("Area of Rectangle= "+a*b);
    }
}
class Triangle extends Shape
{
    void get_data(int l,int h)
    {
        a=l;
        b=h;
    }
    void printArea()
    {
        System.out.println("Area of Triangle= "+0.5*a*b);
    } 
}
class Circle extends Shape
{
    void get_data(int r)
    {
        a=r;
    }
    void printArea()
    {
        System.out.println("Area of Circle= "+3.14*a*a);
    }
}
class Abst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,choice;
        Rectangle r= new Rectangle();
        Triangle t= new Triangle();
        Circle c=new Circle();
        System.out.println("1.Rectangle\n 2.Triangle\n 3.Circle\n 4.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter length and breadth :");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    r.get_data(a,b);
                    r.printArea();
                    break;
            case 2:System.out.println("Enter base and height :");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    t.get_data(a,b);
                    t.printArea();
                    break;
            case 3:System.out.println("Enter radius :");
                    a=sc.nextInt();
                    c.get_data(a);
                    c.printArea();
                    break;
            default: System.out.println("Invalid choice!!!");
            
        }
        

    }
}
