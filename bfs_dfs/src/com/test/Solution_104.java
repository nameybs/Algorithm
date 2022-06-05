package com.test;

public class Solution_104 {
	/**
	�ؿ䱸����
	���� Ʈ���� ��Ʈ�� �־����� �ִ� ���̸� ��ȯ�մϴ�.
	���� Ʈ���� �ִ� ���̴� ��Ʈ ��忡�� ���� �� �� ������ ���� �� ��θ� ���� �ִ� ����� ���Դϴ�.
	
	�ع��
	1. �ִ� ���� �˻� �˰����̱� ������ dfs�� �̿�
	2. ���ڰ��� 2���� �޼ҵ带 ���� ù��° ���ڰ����� ��带 2��° ���ڰ����� ���̸� ����
	3. ���ȣ���� ���� ���̸� +1�� ����
	4. ���ȣ���� �����ϸ� �߰��� ���̸� ��ȯ
	5. ���� ���� ���� ����� ���� ���߿� ū���� ��������� ��ȯ
	
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
