package data.structures;

public class LinkedListDetectCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int HasCycle(Node head) {
	    Node p1 = head;
	    Node p2 = head;
	    
	    while(p1!=null && p2!=null && p2.next!=null)
	        {
	        p1=p1.next;
	        p2=p2.next.next;
	        if(p1==p2) return 1;
	    }
	    return 0;
	}
}
