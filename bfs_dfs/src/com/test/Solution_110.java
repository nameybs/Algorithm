package com.test;

public class Solution_110 {
	/**
	�ؿ䱸����
	���� Ʈ���� �־����� ���� ������ �´��� Ȯ���մϴ�.
	�� �������� ���� ���� ���� Ʈ���� ������ ���� ���ǵ˴ϴ�.
	��� ����� ���� �� ������ ���� Ʈ���� ���̰� 1 ���Ϸ� �ٸ� ���� Ʈ��.
	
	�ع��
	1. �ִ� ���� �˻� �˰����̱� ������ dfs�� �̿�
	2. ���ڰ��� 2���� �޼ҵ带 ���� ù��° ���ڰ����� ��带 2��° ���ڰ����� ���̸� ����
	3. ���ȣ���� ���� ���̸� +1�� ����
	4. ���ȣ���� �����ϸ� �߰��� ���̸� ��ȯ
	5. ���� ���� ���� ����� ���� ���߿� ū���� ��������� ��ȯ
	
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
