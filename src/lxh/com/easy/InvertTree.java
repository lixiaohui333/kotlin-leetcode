package lxh.com.easy;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

import lxh.com.easy.comm.TreeNode;

public class InvertTree {
	
	public static void main(String[] args) {

	}

	public static TreeNode invertTree(TreeNode root) {
		
		if(root==null){
			return null;
		}
		

		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			swap(t);
			
			if(t.left!=null){
				queue.offer(t.left);
			}
			if(t.right!=null){
				queue.offer(t.right);
			}
			
		}
		
		
		return root;
	}
//	public static TreeNode invertTree(TreeNode root) {
//		
//		if(root.left!=null && root.right!=null){
//			swap(root);
//		}
//		
//		
//		if(root.left!=null){
//			invertTree(root.left);
//		}
//		
//		if(root.right!=null){
//			invertTree(root.right);
//		}
//		
//		
//		return root;
//	}

	private static void swap(TreeNode root) {
		TreeNode temp = root.left;
		root.left=root.right;
		root.right=temp;
	}
}
