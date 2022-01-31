package dubblyLinkedList;
import java.util.Scanner;


public class DeleteTailOfDoublyLinkedList {
	public static void print(Node head)
	{
		if(head==null)
			return;
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	public static Node deleteTail(Node head)
	{
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return null;
		}
		Node curr=head;
		
		while(curr.next.next!=null)
		{
			curr=curr.next;
		}
		curr.next=null;
		curr.prev=null;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in array: ");
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
		print(head);
		head=deleteTail(head);
		print(head);
		sc.close();

	}

}
