package com.test;

import java.util.LinkedList;
import java.util.List;

public class Solution_113 {
	/**
	※요구사항
	이진 트리의 루트와 정수 targetSum이 주어지면 트리에 루트-잎 경로가 있어 경로를 따라 모든 값을 더하는 것이 targetSum과 같으면 true를 반환합니다.
	리프는 자식이 없는 노드입니다.
	
	※방법
	1. 최대 깊이의 sum값을 구하는 알고리즘이기 때문에 dfs를 사용
	2. 결과값에 보존하기 위해 target변수로 list를 생성
	3. list에 결과 대입할때는 temp변수로 list를 생성해서 target의 값을 옮기고 list에 추가
	
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
