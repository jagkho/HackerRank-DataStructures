package hackerrank.data.structures;

public class InsertNodeSpecificPositionLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node InsertNth(Node head, int data, int position) {
	    if(head==null)
	        {
	        Node n = new Node();
	        n.data = data;
	        head=n;
	    }
	    else
	        {
	        if(position==0)
	            {
	            Node n = new Node();
	            n.data = data;
	            n.next = head;
	            head=n;
	        }
	        else
	            {
	            Node current = head;
	            int count=0;
	            while(count<position-1)
	                {
	                count+=1;
	                current = current.next;
	            }
	            Node n = new Node();
	            n.data = data;
	            n.next = current.next;
	            current.next = n;
	        }
	    }
	    
	    return head;
	}
}
