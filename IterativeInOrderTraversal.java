package hackerrank.data.structures;

import java.util.Stack;

public class IterativeInOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void Inorder(TreeNode root) {
	    if(root!=null)
	        {
	        Stack<TreeNode> s = new Stack<TreeNode>();
	        TreeNode currentTreeNode=root;
	        while(!s.isEmpty() || currentTreeNode!=null)
	            {
	            if(currentTreeNode!=null)
	                {
	                s.push(currentTreeNode);
	                currentTreeNode=currentTreeNode.left;
	            }
	            else
	                {
	                TreeNode n = s.pop();
	                System.out.print(n.data + " ");
	                currentTreeNode = n.right;
	            }
	        }
	    }
	}
}
