package com.test;

import java.util.LinkedList;
import java.util.List;

public class Solution_113 {
	/**
	�ؿ䱸����
	���� Ʈ���� ��Ʈ�� ���� targetSum�� �־����� Ʈ���� ��Ʈ-�� ��ΰ� �־� ��θ� ���� ��� ���� ���ϴ� ���� targetSum�� ������ true�� ��ȯ�մϴ�.
	������ �ڽ��� ���� ����Դϴ�.
	
	�ع��
	1. �ִ� ������ sum���� ���ϴ� �˰����̱� ������ dfs�� ���
	2. ������� �����ϱ� ���� target������ list�� ����
	3. list�� ��� �����Ҷ��� temp������ list�� �����ؼ� target�� ���� �ű�� list�� �߰�
	
	time complexity O(N)
	space complexity O(N2)
	**/
	
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum, 0, new LinkedList<Integer>(), new LinkedList<List<Integer>>());
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum, int sum, List<Integer> target, List<List<Integer>> list) {
    	if(root == null) return list;
    	target.add(root.val);
    	sum += root.val;
    	if(root.left == null && root.right == null) {
    		if(sum == targetSum) {
    			List<Integer> temp = new LinkedList<Integer>();
    			for (Integer val : target) temp.add(val);
    			list.add(temp);
    		}
    	}
    	if(root.left != null) pathSum(root.left, targetSum, sum, target, list);
    	if(root.right != null) pathSum(root.right, targetSum, sum, target, list);
		target.remove(target.size() - 1);
        return list;
    }
}
