package com.test;

public class Solution_110 {
	/**
	※요구사항
	이진 트리가 주어지면 높이 균형이 맞는지 확인합니다.
	이 문제에서 높이 균형 이진 트리는 다음과 같이 정의됩니다.
	모든 노드의 왼쪽 및 오른쪽 하위 트리의 높이가 1 이하로 다른 이진 트리.
	
	※방법
	1. 최대 깊이 검색 알고리즘이기 때문에 dfs를 이용
	2. 인자값이 2개인 메소드를 만들어서 첫번째 인자값에는 노드를 2번째 인자값에는 깊이를 지정
	3. 재귀호출을 통해 깊이를 +1씩 증가
	4. 재귀호출을 종료하면 추가한 깊이를 반환
	5. 좌측 노드와 우측 노드의 깊이 값중에 큰값을 결과값으로 반환
	
	time complexity O(N)
	space complexity O(N)
	**/
	
    public boolean isBalanced(TreeNode root) {    	
    	return isBalanced(root, 1) > -1 ? true : false;
    }
    
    public int isBalanced(TreeNode root, int dept) {
    	if(dept == -1 || root == null) return dept;
    	if(root.left == null && root.right == null) return dept;
    	int left = dept;
    	int right = dept;
    	if(root.left != null) left = isBalanced(root.left, dept + 1);
    	if(root.right != null) right = isBalanced(root.right, dept + 1);
    	if(left + 1 < right || left > right + 1) return -1;
    	return left > right ? left : right;
    }
}
