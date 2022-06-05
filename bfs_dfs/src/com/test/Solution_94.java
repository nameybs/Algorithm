package com.test;

import java.util.LinkedList;
import java.util.List;

public class Solution_94 {
	/**
	�ؿ䱸����
       ���� Ʈ���� ��Ʈ�� �־����� ��� ���� ���� ��ȸ�� ��ȯ�մϴ�.
	�ع��
	�����ε��� �̿��ؼ� List�� ���ڿ� �־ �����͸� �����ϴ� ����� ���
	
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
