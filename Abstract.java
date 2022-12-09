import java.util.*;
abstract class Shape
{
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape
{
    getdata(int l,int h)
    {
        a=l;
        b=h;
    }
    void printArea()
    {
        System.out.prinltn("Area of Rectangle= "+a*b);
    }
}
class Triangle extends Shape
{
    getdata(int ba,int h)
    {
        a=ba;
        b=h;
    }
    void printArea()
    {
        System.out.println("Area of Triangle= "+0.5*b*h);
    } 
}
class Circle extends Shape
{
    getdata(int r)
    {
        a=r;
     }
    void printArea()
    {
        System.out.println("Area of Circle= ",3.14*r*r);
    }
}
class Abstract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,choice;
        Shape s;
        Rectangle r= new Rectangle();
        Triangle t= new Triangle();
        Circle c=new Circle();
        System.out.println("1.Rectangle\n 2.Triangle\n 3.Circle\n 4.Exit");
        choice=sc.nextInt();
        while(true)
        {
            
        }

    }
}
