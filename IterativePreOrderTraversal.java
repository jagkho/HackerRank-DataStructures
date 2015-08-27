package hackerrank.data.structures;

import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}

public class IterativePreOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void Preorder(TreeNode root) {
	    if(root!=null)
	        {
	        Stack<TreeNode> s = new Stack<TreeNode>();
	        s.push(root);
	        while(!s.isEmpty())
	            {
	            TreeNode temp = s.pop();
	            System.out.print(temp.data + " ");
	            if(temp.right!=null)
	                s.push(temp.right);
	            if(temp.left!=null)
	                s.push(temp.left);
	        }
	    }
	}
}
