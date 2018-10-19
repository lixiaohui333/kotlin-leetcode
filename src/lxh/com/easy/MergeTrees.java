package lxh.com.easy;

public class MergeTrees {

	public static void main(String[] args) {

	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null) {
			return null;
		}
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}

		TreeNode cur = new TreeNode(t1.val+t2.val);
		cur.left = mergeTrees(t1.left,t2.left);
		cur.right = mergeTrees(t1.right,t2.right);

		return cur;

	}

	public class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

}
