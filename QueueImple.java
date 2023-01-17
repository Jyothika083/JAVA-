import java.util.Scanner;
interface Que {
    void enqueue(int item);
    int dequeue();
    void display();
}
class Queue_struct implements Que
{
    int q[];
    int rear=-1;
    int front=0;
    Queue_struct (int size)
    {
        q=new int[size];
    }
    public void enqueue(int item)
    {
        if(rear==q.length-1)
        {
            System.out.println("Queue overflow");
        }
        else
        {
            q[++rear]=item;
        }
    }
    public int dequeue()
    {
        if(front>rear)
        {
            System.out.println("Queue underflow");
            return 0;
        }
        else
        {
            return q[front++];
        }

    }
    public void display()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(q[i]);
            }
        }
    }
}
class QueueImple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Queue_struct q1=new Queue_struct(3);
        while(true)
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display");
            System.out.println("Enter your choice");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:System.out.println("Enter an item");
                        int item=sc.nextInt();
                        q1.enqueue(item);
                        break;
                case 2:System.out.println("Item deleted is "+q1.dequeue());
                        break;
                case 3:q1.display();
                        break;
                default: System.exit(1);
            }

        }
    }
}