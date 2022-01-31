package dubblyLinkedList;
import java.util.Scanner;

public class InsertAtBeggining {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	public static Node insertBiginning(Node head,int num)
	{
		Node temp=new Node(num);
		temp.next=head;
		if(head!=null)
		{
			head.prev=temp;
		}
		return temp;
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
		System.out.println("Enter the element to Enter at biginning: ");
		int num=sc.nextInt();
		head=insertBiginning(head,num);
		print(head);
		sc.close();

	}

}
