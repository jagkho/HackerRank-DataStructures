package data.structures;

public class LinkedListGetNodeValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method.
	    int len = 0;
	    Node temp=head;
	    while(temp.next!=null)
	        {
	        temp=temp.next;
	        len+=1;
	    }
	    int index = len-n;
	    int i=0;
	    temp = head;
	    while(i<index)
	        {
	        temp=temp.next;
	        i+=1;
	    }
	    return temp.data;
	}
}
