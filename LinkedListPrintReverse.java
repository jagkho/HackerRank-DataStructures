package hackerrank.data.structures;

public class LinkedListPrintReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void ReversePrint(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	    if(head==null) return;
	    ReversePrint(head.next);
	    System.out.println(head.data);
	}
}
