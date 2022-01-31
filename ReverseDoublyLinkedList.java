package dubblyLinkedList;
import java.util.Scanner;


public class ReverseDoublyLinkedList {
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
	public static Node reverseDoublyLinkedList(Node head)
	{
		if(head==null)
		{
			return head;
		}
		Node prevv=null;
		Node curr=head;
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prevv;
			curr.prev=next;
			prevv=curr;
			curr=next;
		}
		return prevv ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.prev=head;
		head.next.next.prev=head.next;
		head.next.next.next.prev=head.next.next;
		
		print(head);
		head=reverseDoublyLinkedList(head);
		print(head);
		
		sc.close();
		

	}

}
