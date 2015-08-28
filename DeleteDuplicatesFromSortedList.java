package data.structures;

import java.util.HashSet;

public class DeleteDuplicatesFromSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node RemoveDuplicates(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	    if(head==null) return null;
	    Node p1=head;
	    Node previous = null;
	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    while(p1!=null)
	        {
	        if(set.contains(p1.data))
	            previous.next = p1.next;
	        else
	            {
	            set.add(p1.data);
	            previous=p1;
	        }
	        p1=p1.next;
	    }
	    
	    return head;
	}
}
