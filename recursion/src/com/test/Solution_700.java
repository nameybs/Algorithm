package com.test;

public class Solution_700 {
	/**
	※요구사항
       이진 탐색 트리(BST)의 루트와 정수 val이 제공됩니다.
    BST에서 노드의 값이 val과 같은 노드를 찾고 해당 노드를 기반으로 하는 하위 트리를 반환합니다. 
       그러한 노드가 존재하지 않으면 null을 반환합니다.
	※방법
    1. 트리 노드가 null일 경우 노드를 반환
    2. 트리 노드의 값이 val과 같을 경우 노드를 반환
    3. 트리 노드가 가장 안쪽까지 도달했을 경우 null을 반환
    4. 반환용 트리를 생성해서 좌측 이진트리를 재귀호출
    5. 좌측 이진트리 처리중에 노드의 값이 val과 같은 노드가 발견되지 않았을 경우 우측 노드를 재귀호출
    6. 결과값을 반환
	
	time complexity O(N)
	space complexity O(N)
	**/
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
    	if(root.left == null && root.right == null) return null;
    	
    	TreeNode result = searchBST(root.left, val);
    	if(result == null)
    		result = searchBST(root.right, val);
    	
        return result;
    }
}
