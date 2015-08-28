package data.structures;

public class MergeSortedLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    if(headA == null && headB == null) return null;
	    if(headA == null && headB != null) return headB;
	    if(headA != null && headB == null) return headA;
	    else
	        {
	        Node p1 = headA;
	        Node p2 = headB;
	        Node fakeHead = new Node();
	        Node p = fakeHead;
	        
	        while(p1!=null && p2!=null)
	            {
	            if(p1.data<p2.data)
	                {
	                p.next=p1;
	                p1=p1.next;
	            }
	            else if(p2.data<p1.data)
	                {
	                p.next=p2;
	                p2=p2.next;
	            }
	            p=p.next;
	        }
	        if(p1!=null) p.next=p1;
	        if(p2!=null) p.next=p2;
	        return fakeHead.next;
	    }
	}
}
