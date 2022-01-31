package dubblyLinkedList;

public class CreatingDoublyLinkedList {
	public static void print(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.prev=head;
		head.next.next.prev=head.next;
		head.next.next.next.prev=head.next.next;
		print(head);

	}

}
