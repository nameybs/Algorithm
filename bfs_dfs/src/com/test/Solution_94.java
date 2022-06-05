package com.test;

import java.util.LinkedList;
import java.util.List;

public class Solution_94 {
	/**
	※요구사항
       이진 트리의 루트가 주어지면 노드 값의 중위 순회를 반환합니다.
	※방법
	오버로딩을 이용해서 List를 인자에 넣어서 데이터를 축적하는 방식을 사용
	
	time complexity O(1)
	space complexity O(N)
	**/
	
    public List<Integer> inorderTraversal(TreeNode root) {

    	List<Integer> result = new LinkedList<Integer>();
    	inorderTraversal(root, result);
		return result;
    }
    
    public List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
    	
    	if(root == null) return list;
    	
    	list = inorderTraversal(root.left, list);
    	list.add(root.val);
    	list = inorderTraversal(root.right, list);
    	
    	return list;
    }
}
