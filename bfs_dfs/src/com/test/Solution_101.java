package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_101 {
	/**
	※요구사항
	이진 트리의 루트가 주어졌을 때 그것이 자신의 거울인지(즉, 중심을 중심으로 대칭인지) 확인하십시오.
	
	※방법
	1. left,right노드를 생성해서 root노드의 좌우를 분할
	2. bfs방식으로 한줄씩 탐색해서 노드를 비교
	3. 큐에 추가할 경우 좌측과 우측을 대칭으로 삽입하도록 지정
	
	time complexity O(N)
	space complexity O(2N)
	
	※고민했던 부분
	좌우 노드를 분할하지 않고 노드 한개로 하는 방법
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
