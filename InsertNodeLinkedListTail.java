package hackerrank.data.structures;

public class InsertNodeLinkedListTail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node Insert(Node head,int data) {
	// This is a "method-only" submission. 
	// You only need to complete this method. 
	    if(head==null)
	        {
	        Node n = new Node();
	        n.data = data;
	        head=n;
	        return head;
	    } 
	    else
	        {
	        Node current = head;
	        while(current.next!=null)
	            current=current.next;

	        Node n = new Node();
	        n.data = data;
	        current.next = n;
	        return head;
	    }
	}
}
