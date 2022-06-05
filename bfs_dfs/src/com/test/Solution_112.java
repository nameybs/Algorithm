package com.test;

public class Solution_112 {
	/**
	※요구사항
	이진 트리의 루트와 정수 targetSum이 주어지면 트리에 루트-잎 경로가 있어 경로를 따라 모든 값을 더하는 것이 targetSum과 같으면 true를 반환합니다.
	리프는 자식이 없는 노드입니다.
	
	※방법
	1. 최대 깊이의 sum값을 구하는 알고리즘이기 때문에 dfs를 사용
	2. 재귀함수를 통해 들어갈때마다 sum에 val값을 추가
	3. 가장 깊은곳에 들어왔을 경우에 sum이target과 같은지를 확인
	4. 같을 경우 result를  true로 반환
	5. result가 true가 되었을 경우에는 다음 처리를 실시하지 않고 리턴 
	
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
