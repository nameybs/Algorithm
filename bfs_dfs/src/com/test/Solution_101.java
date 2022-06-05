package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_101 {
	/**
	�ؿ䱸����
	���� Ʈ���� ��Ʈ�� �־����� �� �װ��� �ڽ��� �ſ�����(��, �߽��� �߽����� ��Ī����) Ȯ���Ͻʽÿ�.
	
	�ع��
	1. left,right��带 �����ؼ� root����� �¿츦 ����
	2. bfs������� ���پ� Ž���ؼ� ��带 ��
	3. ť�� �߰��� ��� ������ ������ ��Ī���� �����ϵ��� ����
	
	time complexity O(N)
	space complexity O(2N)
	
	�ذ���ߴ� �κ�
	�¿� ��带 �������� �ʰ� ��� �Ѱ��� �ϴ� ���
	**/
	
	public boolean isSymmetric(TreeNode root) {
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		if(left == null && right == null) return true;
		if((left == null && right != null) || (left != null && right == null)) return false;
		
		Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
		Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
		
		queue1.offer(left);
		queue2.offer(right);
		
		while(!queue1.isEmpty() && !queue1.isEmpty()) {
			if(queue1.size() != queue2.size()) return false;
			 for(int i = 0; i < queue1.size(); i++) {
				 TreeNode cur1 = queue1.poll();
				 TreeNode cur2 = queue2.poll();
				 
				 if(cur1 == null && cur2 == null) continue;
				 if(cur1 == null || cur2 == null) return false;
				 if(cur1.val != cur2.val) return false;
				 
				 queue1.offer(cur1.left);
				 queue1.offer(cur1.right);
				 queue2.offer(cur2.right);
				 queue2.offer(cur2.left);
			 }
		}
		return true;
	}
}
