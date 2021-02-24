import java.util.*;
class MyNode
{
	int data;
	MyNode next;
}
class MyLinkedList
{
	MyNode head=null;
	MyNode last=null;
	Scanner s=new Scanner(System.in);
	void create(int n)
	{
		MyNode temp;
		for(int i=0;i<n;i++)
		{
			temp=new MyNode();
			System.out.println("Enter the data");
			temp.data=s.nextInt();
			temp.next=null;
			if(head==null)
				head=last=temp;
			else
			{
				last.next=temp;
				last=temp;
			}
		}
	}
	void dispaly()
	{
		MyNode temp;
		for(temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.data+"->");
		System.out.println("NULL");
	}
	void insertB()
	{
		MyNode temp=new MyNode();
		System.out.println("Enter element to be inserted");
		temp.data=s.nextInt();
		temp.next=head;
		head=temp;
	}
	void insertE()
	{
		MyNode temp=new MyNode();
		System.out.println("Enter element to be inserted");
		temp.data=s.nextInt();
		temp.next=null;
		MyNode temp1;
		for(temp1=head;temp1.next!=null;temp1=temp1.next);
		temp1.next=temp;
	}
	void insertP(int p)
	{
		MyNode temp=new MyNode();
		System.out.println("Enter element to be inserted");
		temp.data=s.nextInt();
		MyNode temp1;
		int i;
		for(i=0,temp1=head;i<p-1;i++,temp1=temp1.next);
		temp.next=temp1.next;
		temp1.next=temp;
	}
	void deleteB()
	{
		MyNode temp=head;
		head=temp.next;
		temp=null;
	}
	void deleteE()
	{
		MyNode temp,temp1;
		temp=head;
		temp1=null;
		while(temp.next!=null)
		{
			temp1=temp;
			temp=temp.next;
		}
		temp1.next=null;
		temp=null;
		last=temp1;
	}
	void deleteP(int p)
	{
		MyNode temp,temp1;
		int i;
		for(i=0,temp=head;i<p-1;i++,temp=temp.next);
		temp1=temp.next;
		temp.next=temp1.next;
		temp1=null;
	}
}
public class SinglyLinkedList
{
	public static void main(String[] args)
	{
		int ch;
		Scanner s=new Scanner(System.in);
		MyLinkedList l=new MyLinkedList();
		System.out.println("Enter the size of the list");
		l.create(s.nextInt());
		while(true)
		{
			System.out.println("1.Insert at Beginning\n2.Insert at End\n3.Insert at position\n4.Delete at Beginning\n5.Delete at End\n6.Delete at Position\n7.Display");
			System.out.println("Enter Ur Choice");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:l.insertB();
				break;
				case 2:l.insertE();
				break;
				case 3:System.out.println("Enter the position");
							l.insertP(s.nextInt());
							break;
				case 4:l.deleteB();
				break;
				case 5:l.deleteE();
				break;
				case 6:System.out.println("Enter the position");
							l.deleteP(s.nextInt());
							break;
				case 7:l.dispaly();
				break;
				default:return;
			}
		}
	}
}

	