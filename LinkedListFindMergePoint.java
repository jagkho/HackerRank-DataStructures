package data.structures;

public class LinkedListFindMergePoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int FindMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 
	    Node p1=headA;
	    Node p2=headB;
	    int len1=0;
	    int len2=0;
	    
	    while(p1.next!=null)
	        {
	        len1+=1;
	        p1=p1.next;
	    }
	    while(p2.next!=null)
	        {
	        len2+=1;
	        p2=p2.next;
	    }
	    
	    if(len1>len2)
	        {
	        Node p3=headA;
	        int i=0;
	        while(i<(len1-len2))
	            {
	            p3=p3.next;
	            i+=1;
	        }
	        Node p4 = headB;
	        while(p3!=p4)
	            {
	            p3=p3.next;
	            p4=p4.next;
	        }
	        return p3.data;
	    }
	    else if(len2>len1)
	        {
	        Node p3 = headB;
	        int i=0;
	        while(i<(len2-len1))
	            {
	            p3=p3.next;
	            i+=1;
	        }
	        Node p4 = headA;
	        while(p3!=p4)
	            {
	            p3=p3.next;
	            p4=p4.next;
	        }
	        return p3.data;
	    }
	    else
	        {
	        Node p3=headA;
	        Node p4=headB;
	        while(p3!=p4)
	            {
	            p3=p3.next;
	            p4=p4.next;
	        }
	        return p3.data;
	    }
	}
}
