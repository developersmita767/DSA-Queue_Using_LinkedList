import java.util.*;
class Node
{
	int data;
	Node next;
	Node()
	{

	}
	Node(int data)
	{
	 this.data=data;
	}
}
 class MyQueue
 {
   static Node rear,front;
   static void push(int ele)
   {
    Node cur=new Node(ele);
    if(cur==null)
    {
      System.out.println("Q overflow");
      return;

    }
    if(front==null)
    {
     rear=cur;
     front=cur;
     return;
    }
    rear.next=cur;
    rear=cur;
     System.out.println(ele+" insert ");
    }
    static void pop()
    {
     if(front==null)
     {
       System.out.println("no element");
       return;
     }
      System.out.println("delete element= "+front.data);
      front=front.next;
    }
    static void peek()
    {
      if(front==null)
     {
       System.out.println("no element");
       return;
     }
      System.out.println("top element="+front.data);
    }
      static void disp()
    {
      if(front==null)
     {
       System.out.println("no element");
       return;
     }
     System.out.println("elements are ");
     Node temp=front;
     while(temp!=null)
     {
      System.out.println(temp.data);
      temp=temp.next;
      }
   }
}
  class Test
   {
	   public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
            MyQueue m=new MyQueue();
            int ch;
            while(true)
             {
                System.out.println("enter your choice\n1.push\n2.pop\n3.peek\n4.disp\n5.exit");
                ch=sc.nextInt();
                 switch(ch)
                  {
                   case 1:
                   System.out.println("enter a element ");
                   m.push(sc.nextInt());
                   break;
                   case 2:
                   m.pop();
                   break;
                   case 3:
                   m.peek();
                   break;
                   case 4:
                   m.disp();
                   break;
                   case 5:
                   System.exit(0);
                   default:System.out.println("invalid choice ");

         }
       
       }	
	}
}
	


