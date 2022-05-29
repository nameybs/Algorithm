package com.test;

public class Solution_700 {
	/**
	�ؿ䱸����
       ���� Ž�� Ʈ��(BST)�� ��Ʈ�� ���� val�� �����˴ϴ�.
    BST���� ����� ���� val�� ���� ��带 ã�� �ش� ��带 ������� �ϴ� ���� Ʈ���� ��ȯ�մϴ�. 
       �׷��� ��尡 �������� ������ null�� ��ȯ�մϴ�.
	�ع��
    1. Ʈ�� ��尡 null�� ��� ��带 ��ȯ
    2. Ʈ�� ����� ���� val�� ���� ��� ��带 ��ȯ
    3. Ʈ�� ��尡 ���� ���ʱ��� �������� ��� null�� ��ȯ
    4. ��ȯ�� Ʈ���� �����ؼ� ���� ����Ʈ���� ���ȣ��
    5. ���� ����Ʈ�� ó���߿� ����� ���� val�� ���� ��尡 �߰ߵ��� �ʾ��� ��� ���� ��带 ���ȣ��
    6. ������� ��ȯ
	
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
