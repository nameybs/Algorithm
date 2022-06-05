package com.test;

public class Solution_100 {
	/**
	�ؿ䱸����
	�� ���� Ʈ�� p�� q�� ��Ʈ�� �־����� �� ������ �ƴ��� Ȯ���ϴ� �Լ��� �ۼ��Ͻʽÿ�.
	�� ���� ���� Ʈ���� ���������� �����ϰ� ��尡 ������ ���� ���� ��� ������ ������ ���ֵ˴ϴ�.
	
	�ع��
	dfs�� �̿��� ���� ��带 ���ÿ� �̵��ؼ� ������� ����
	
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
