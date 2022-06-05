package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Sample {
	public void BFS(TreeNode root) {
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		Q.offer(root);
		int Level = 0;
		while(!Q.isEmpty()) {
			 int len = Q.size();
			 System.out.print(Level + " : ");
			 for(int i=0; i<len; i++) {
				 TreeNode cur = Q.poll();
				 System.out.print(cur.val + " ");
				 if(cur.left!=null) {
					 Q.offer(cur.left);
				 }
				 if(cur.right != null) {
					 Q.offer(cur.right);
				 }
			 }
			 Level++;
			 System.out.println();
		}
	}
}
