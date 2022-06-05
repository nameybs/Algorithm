package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_111 {
	/**
	※요구사항
	이진 트리가 주어지면 최소 깊이를 찾으십시오.
	최소 깊이는 루트 노드에서 가장 가까운 리프 노드까지 최단 경로를 따라 있는 노드의 수입니다.
	참고: 리프는 자식이 없는 노드입니다.
	
	※방법
	1. 최단 노드 검색 관련이기 때문에 bfs를 사용
	2. root노드가 null일 경우 0을 반환
	3. root노드에 자식노드가 모두 null일 경우 1을 반환
	4. 노드를 queue에 넣고 탐색
	5. 양쪽 노드에 leaf노드가 있는 경우에 해당 깊이를 반환
	6. 한쪽만 leaf노드가 있는 경우에는 양쪽 노드가 나오거나 노드의 마지막까지 계속 탐색
	
	time complexity O(N)
	space complexity O(N)
	**/
	
    public int minDepth(TreeNode root) {
    	if(root == null) return 0;
    	if(root.left == null && root.right == null) return 1;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	int dept = 0;
		while(!queue.isEmpty()) {
			dept++;
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode cur = queue.poll();
				if(cur.left == null && cur.right == null) return dept;
				if(cur.left != null) queue.offer(cur.left);
				if(cur.right != null) queue.offer(cur.right);
			 }
		}
    	return dept;
    }
}
