package dubblyLinkedList;
import java.util.Scanner;

public class InsertInSortedDoublyLinkedList {
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
	public static Node insertInSortedDoubly(Node head,int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			return temp;
		}
		if(head.data>data)
		{
			temp.next=head;
			head.prev=temp;
			return temp;
		}
		Node curr=head;
		while(curr.next!=null&&curr.next.data<data)
		{
			curr=curr.next;
		}
		if(curr.next==null)
		{
			curr.next=temp;
			temp.prev=curr;
		}
		else
		{
			temp.next=curr.next;
			curr.next=temp;
			curr.next.next.prev=temp;
			temp.prev=curr;
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente the number of element in array: ");
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
		System.out.print("Enter the number: ");
		int data=sc.nextInt();
		print(head);
		head=insertInSortedDoubly(head,data);
		print(head);
		sc.close();

	}

}
