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
     public String toString()
    {
        return name+"\t\t"+author+"\t\t"+price+"\t\t"+num_pages+"\n";
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
	  System.out.println("Book title\tAuthor name\tPrice\tNumber of pages");
        for(int i=0;i<count;i++)
        {
            System.out.println(b[i]);
        }
    }
}
