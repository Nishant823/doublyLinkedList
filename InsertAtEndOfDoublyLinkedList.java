package dubblyLinkedList;
import java.util.Scanner;

public class InsertAtEndOfDoublyLinkedList {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node insertAtEnd(Node head,int num)
	{
		Node temp=new Node(num);
		if(head==null)
		{
			return temp;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=temp;
		temp.prev=curr;
		return head;
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
		System.out.print("Enter the numbert to insert at last: ");
		int num=sc.nextInt();
		head=insertAtEnd(head,num);
		print(head);
		sc.close();

	}

}
