package hackerrank.data.structures;

public class DeleteNodeAtSpecificPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node Delete(Node head, int position) {
	  // Complete this method
	    if(head!=null)
	        {
	        if(position==0)
	            head=head.next;
	        else
	            {
	            Node current = head;
	            int count=0;
	            while(count<position-1)
	                {
	                count+=1;
	                current = current.next;
	            }
	            if(current.next.next!=null)
	                current.next = current.next.next;
	            else current.next=null;
	        }
	    }
	    
	    return head;
	}
}
