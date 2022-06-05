package com.test;

public class Solution_104 {
	/**
	※요구사항
	이진 트리의 루트가 주어지면 최대 깊이를 반환합니다.
	이진 트리의 최대 깊이는 루트 노드에서 가장 먼 잎 노드까지 가장 긴 경로를 따라 있는 노드의 수입니다.
	
	※방법
	1. 최대 깊이 검색 알고리즘이기 때문에 dfs를 이용
	2. 인자값이 2개인 메소드를 만들어서 첫번째 인자값에는 노드를 2번째 인자값에는 깊이를 지정
	3. 재귀호출을 통해 깊이를 +1씩 증가
	4. 재귀호출을 종료하면 추가한 깊이를 반환
	5. 좌측 노드와 우측 노드의 깊이 값중에 큰값을 결과값으로 반환
	
	time complexity O(N)
	space complexity O(2N)
	**/
	
    public int maxDepth(TreeNode root) {
    	return maxDepth(root, 0);
    }
    
    public int maxDepth(TreeNode root, int dept) {
    	if(root == null) return dept;
    	if(root.left == null && root.right == null) return dept + 1;
    	int left = dept;
    	int right = dept;
    	if(root.left != null) left = maxDepth(root.left, dept + 1);
    	if(root.right != null) right = maxDepth(root.right, dept + 1);
    	return left > right ? left : right;
    }
}
