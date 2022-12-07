import java.util.*;
class Book
{
    String name;
    String author;
    int price;
    int num_pages;
    Book(String n,String a,int p,int no)
    {
        name=n;
        author=a;
        price=p;
        num_pages=no;

    }
    void display()
    {
        System.out.println("Book title :"+name);
        System.out.println("Author name :"+author);
        System.out.println("Price :"+price);
        System.out.println("Number of pages :"+num_pages);
    }
}
class Book_details
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("Enter the total number of books");
        count=sc.nextInt();
        Book b[]=new Book[count];
        String n,a;
        int p,no;
       
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter the details");
            System.out.println("Enter the book title");
            n=sc.next();
            System.out.println("Enter the author's name");
            a=sc.next();
            System.out.println("Enter the price of the book");
            p=sc.nextInt();
            System.out.println("Enter the total number of pages");
            no=sc.nextInt();
            b[i]=new Book(n,a,p,no);
        }
        for(int i=0;i<count;i++)
        {
            b[i].display();
        }
    }
}