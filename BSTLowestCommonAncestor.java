package data.structures;

public class BSTLowestCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static TreeNode lca(TreeNode root,int v1,int v2)
    {
        if(root==null) return null;
        if(v1<root.data && v2<root.data)
            return lca(root.left, v1, v2);
        if(v1>root.data && v2>root.data)
            return lca(root.right, v1, v2);
        else return root;
    }
}
