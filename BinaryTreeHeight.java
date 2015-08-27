package hackerrank.data.structures;

public class BinaryTreeHeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int height(TreeNode root)
    {
       if(root==null) return 0;
       else return 1+Math.max(height(root.left), height(root.right));
    }
}
