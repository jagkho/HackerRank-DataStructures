package hackerrank.data.structures;

import java.util.Stack;

public class IterativePostOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void Postorder(TreeNode root) {
	    if(root!=null)
	        {
	        Stack<TreeNode> s1 = new Stack<TreeNode>();
	        Stack<TreeNode> s2 = new Stack<TreeNode>();
	        s1.push(root);
	        while(!s1.isEmpty())
	            {
	            TreeNode temp = s1.pop();
	            s2.push(temp);
	            if(temp.left!=null)
	                s1.push(temp.left);
	            if(temp.right!=null)
	                s1.push(temp.right);
	        }
	        while(!s2.isEmpty())
	            System.out.print(s2.pop().data + " ");
	    }
	}
}
