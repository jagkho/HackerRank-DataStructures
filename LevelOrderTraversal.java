package hackerrank.data.structures;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void LevelOrder(TreeNode root)
    {
       if(root!=null)
           {
           Queue<TreeNode> q = new LinkedList<TreeNode>();
           q.add(root);
           while(!q.isEmpty())
               {
               TreeNode n = q.remove();
               System.out.print(n.data + " ");
               if(n.left!=null)
                   q.add(n.left);
               if(n.right!=null)
                   q.add(n.right);
           }
       }
    }
}
