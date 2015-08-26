package hackerrank.data.structures;

public class InsertNodeLinkedListHead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node Insert(Node head,int x) {
	    if(head==null)
	        {
	        Node n = new Node();
	        n.data = x;
	        head=n;
	        return head;
	    }
	    else
	        {
	        Node n = new Node();
	        n.data = x;
	        n.next=head;
	        head=n;
	        return head;
	    }
	}
}
