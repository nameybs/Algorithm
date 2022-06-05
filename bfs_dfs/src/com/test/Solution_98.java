package com.test;

public class Solution_98 {
	/**
	�ؿ䱸����
	���� Ʈ���� ��Ʈ�� �־����� ��ȿ�� BST(���� �˻� Ʈ��)���� Ȯ���մϴ�.
	
	��ȿ�� BST�� ������ ���� ���ǵ˴ϴ�.
	1.����� ���� ���� Ʈ������ ��� Ű���� ���� Ű�� ���� ��常 ���Ե˴ϴ�.
	2.����� ������ ���� Ʈ������ ��� Ű���� ū Ű�� �ִ� ��常 ���Ե˴ϴ�.
	3.���� �� ������ ���� Ʈ���� ��� ���� �˻� Ʈ������ �մϴ�.
	
	�ع��
	Ǯ�̹�� : DFS
	1. �����ε��� �̿��ؼ� ���� ���� ���� ����� �� ������ ��� �Ķ���͸� �߰�
	2. root��尡 null�� ��쿡�� true��ȯ
	3. BST���� 1,2�� Ȯ��
	4. ��͸� ���鼭 ���� ��� �񱳽ÿ��� �Ķ���� ������ (�������, min, ��尪)
	5. ���� ��� �񱳽ÿ��� �Ķ���� ������ (�������, ��尪, max)�� ����
	
	time complexity O(N)
	space complexity O(N)
	
	������� �κ�
	1. ���� ���ظ� ����� ���� ����
	     ���� Ʈ���� ���� ��� Ʈ�� ���¸� �����ؾ߸� �ϴ� �������� �˾Ҵ� �κ�
	     �¿��� �� ����� �ٷ� �� ���� ��常 �����ϸ� �Ǵ��� �˾Ҵ� �κ�
	
	���ΰ� �ʿ��� �κ�
	1. ����Ʈ���� ���� �� ������ ���ؼ� ���ΰ� �ʿ��ϴٰ� �������ϴ�.
	
	**/
	
    public boolean isValidBST(TreeNode root) {
    	return isValidBST(root, null, null);
    }
    
    boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
