package com.test;

public class Solution_112 {
	/**
	�ؿ䱸����
	���� Ʈ���� ��Ʈ�� ���� targetSum�� �־����� Ʈ���� ��Ʈ-�� ��ΰ� �־� ��θ� ���� ��� ���� ���ϴ� ���� targetSum�� ������ true�� ��ȯ�մϴ�.
	������ �ڽ��� ���� ����Դϴ�.
	
	�ع��
	1. �ִ� ������ sum���� ���ϴ� �˰����̱� ������ dfs�� ���
	2. ����Լ��� ���� �������� sum�� val���� �߰�
	3. ���� �������� ������ ��쿡 sum��target�� �������� Ȯ��
	4. ���� ��� result��  true�� ��ȯ
	5. result�� true�� �Ǿ��� ��쿡�� ���� ó���� �ǽ����� �ʰ� ���� 
	
	time complexity O(N)
	space complexity O(N)
	**/
	
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum, int sum) {
    	if(root == null) return false;
    	sum += root.val;
    	if(root.left == null && root.right == null) {
    		if(sum == targetSum) return true;
    	}
    	
    	boolean result = false;
    	if(root.left != null) result = hasPathSum(root.left, targetSum, sum);
    	if(result == true) return result;
    	if(root.right != null) result = hasPathSum(root.right, targetSum, sum);
    	
        return result;
    }
}
