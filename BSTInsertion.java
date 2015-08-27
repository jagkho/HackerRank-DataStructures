package hackerrank.data.structures;

class BSTNode
{
	int data;
	BSTNode left;
	BSTNode right;
}

public class BSTInsertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static BSTNode Insert(BSTNode root,int value)
    {
        if(root==null)
            {
            BSTNode n = new BSTNode();
            n.data = value;
            return n;
        }
        else
            {
            if(value<root.data)
                {
                if(root.left==null)
                    {
                    BSTNode n = new BSTNode();
                    n.data = value;
                    root.left=n;
                }
                else Insert(root.left, value);
            }
            else
                {
                if(root.right==null)
                    {
                    BSTNode n = new BSTNode();
                    n.data = value;
                    root.right=n;
                }
                else Insert(root.right, value);
            }
        }
        return root;
    }
}
