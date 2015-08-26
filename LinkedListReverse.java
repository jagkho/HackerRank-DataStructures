package hackerrank.data.structures;

class Node {
    int data;
    Node next;
 }

public class LinkedListReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	Node Reverse(Node head) 
    {
    if(head==null || head.next==null)
        return head;
    
    Node rest = Reverse(head.next);
    head.next.next = head;
    head.next = null;
    return rest;
    }
}
