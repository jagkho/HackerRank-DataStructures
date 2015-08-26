package hackerrank.data.structures;

public class LinkedListPrintElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void Print(Node head) {
	  Node current = head;
	    while(current!=null)
	        {
	        System.out.println(current.data);
	        current = current.next;
	    }
	}
}
