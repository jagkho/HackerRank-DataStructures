package hackerrank.data.structures;

public class CompareLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method
	    if(headA!=null && headB!=null)
	        {
	        Node currentA = headA;
	        Node currentB = headB;
	        
	        while(currentA!=null && currentB!=null)
	            {
	            if(currentA.data!=currentB.data) return 0;
	            currentA = currentA.next;
	            currentB = currentB.next;
	        }
	        if(currentA!=null || currentB!=null) return 0;
	        else return 1;
	    }
	    else
	        return 0;
	}
}
