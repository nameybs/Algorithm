package com.test;

public class Solution_99 {
	/**
	※요구사항
	BST(이진 검색 트리)의 루트가 제공되며 트리의 정확히 두 노드 값이 실수로 교환되었습니다. 
	구조를 변경하지 않고 트리를 복구합니다.
	
	Input: root = [1,3,null,null,2]
	Output: [3,1,null,null,2]
	설명: 3은 3 > 1이므로 1의 왼쪽 자식이 될 수 없습니다. 1과 3을 바꾸면 BST가 유효합니다.
	
	※방법
	1. 바꿀 대상의 노드를 전역변수로 지정 temp1, temp2
	2. 노드의 끝까지  
	노드의 값이 root노드의 값보다 큰지 판정
	3. 
	
	time complexity O(N)
	space complexity O(N)
	**/
	private TreeNode temp1;
	private TreeNode temp2;
	private TreeNode buf;
	
    public void recoverTree(TreeNode root) {
    	if(root == null) return;
    	
    	temp1 = null;
    	temp2 = null;
    	buf = null;
    	
    	recoverTree2(root);
    	int temp = temp1.val;
    	temp1.val = temp2.val;
    	temp2.val = temp;
    }
    
    public void recoverTree2(TreeNode root) {
        if (root == null) return;
        recoverTree2(root.left);
        if (temp1 == null && (buf == null || buf.val >= root.val)) temp1 = buf;
        if(temp1 != null && buf.val >= root.val) temp2 = root;
        buf = root;
        recoverTree2(root.right);
    }
}
