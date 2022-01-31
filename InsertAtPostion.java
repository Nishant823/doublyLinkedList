package dubblyLinkedList;
import java.util.Scanner;


public class InsertAtPostion {
	public static void print(Node head)
	{
		if(head==null)
		{
			return;
		}
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static int getLength(Node head)
	{
		if(head==null)
		{
			return 0;
		}
		return 1+getLength(head.next);
		
	}
	public static Node insertAtPosition(Node head,int data,int pos)
	{
		if(head==null)
		{
			return null;
		}
		Node temp=new Node(data);
		if(pos>getLength(head))
		{
			return head;
		}
		if(pos==getLength(head))
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=temp;
			temp.prev=curr;
			return head;
		}
		Node curr=head;
		for(int i=1;i<pos;i++)
		{
			curr=curr.next;
		}
		temp.next=curr.next;
		curr.next=temp;
		curr.next.prev=temp;
		temp.prev=curr;
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Node head=new Node(arr[0]);
		Node curr=head;
		for(int i=1;i<n;i++)
		{
			curr.next=new Node(arr[i]);
			curr.next.prev=curr;
			curr=curr.next;	
		}
		System.out.print("Enter the number to insert: ");
		int data=sc.nextInt();
		System.out.print("Enter the position to insert: ");
		int pos=sc.nextInt();
		print(head);
		head=insertAtPosition(head,data,pos);
		print(head);
	
		sc.close();

	}

}
