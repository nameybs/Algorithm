package com.test;

public class Solution_100 {
	/**
	※요구사항
	두 이진 트리 p와 q의 루트가 주어졌을 때 같은지 아닌지 확인하는 함수를 작성하십시오.
	두 개의 이진 트리는 구조적으로 동일하고 노드가 동일한 값을 갖는 경우 동일한 것으로 간주됩니다.
	
	※방법
	dfs를 이용해 양쪽 노드를 동시에 이동해서 결과값을 추출
	
	time complexity O(N)
	space complexity O(N)
	**/
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		if(p.val != q.val) return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
