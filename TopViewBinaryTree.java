package hackerrank.data.structures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class QItem
{
   TreeNode TreeNode;
   int hd;
   public QItem(TreeNode n, int h)
   {
        TreeNode = n;
        hd = h;
   }
}
public class TopViewBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void top_view(TreeNode root)
	{
	    if(root==null) return;
	    HashSet<Integer> set = new HashSet<Integer>();
	    TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	    Queue<QItem> Q = new LinkedList<QItem>();
	    Q.add(new QItem(root, 0));
	    
	    while(!Q.isEmpty())
	        {
	        QItem qi = Q.remove();
	        int hd = qi.hd;
	        TreeNode n = qi.TreeNode;
	        
	        if (!set.contains(hd))
	            {
	            set.add(hd);
	            map.put(hd, n.data);
	        }

	        if (n.left != null)
	            Q.add(new QItem(n.left, hd-1));
	        if (n.right != null)
	            Q.add(new QItem(n.right, hd+1));
	    }
	    
	    for (Map.Entry<Integer, Integer> entry : map.entrySet())
	        System.out.print(entry.getValue() + " ");
	}
}
