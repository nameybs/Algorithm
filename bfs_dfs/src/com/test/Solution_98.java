package com.test;

public class Solution_98 {
	/**
	※요구사항
	이진 트리의 루트가 주어지면 유효한 BST(이진 검색 트리)인지 확인합니다.
	
	유효한 BST는 다음과 같이 정의됩니다.
	1.노드의 왼쪽 하위 트리에는 노드 키보다 작은 키를 가진 노드만 포함됩니다.
	2.노드의 오른쪽 하위 트리에는 노드 키보다 큰 키가 있는 노드만 포함됩니다.
	3.왼쪽 및 오른쪽 하위 트리도 모두 이진 검색 트리여야 합니다.
	
	※방법
	풀이방식 : DFS
	1. 오버로딩을 이용해서 좌측 노드와 우측 노드의 비교 조건을 담는 파라미터를 추가
	2. root노드가 null일 경우에는 true반환
	3. BST조건 1,2를 확인
	4. 재귀를 돌면서 좌측 노드 비교시에는 파라미터 설정을 (좌측노드, min, 노드값)
	5. 우측 노드 비교시에는 파라미터 설정을 (우측노드, 노드값, max)로 설정
	
	time complexity O(N)
	space complexity O(N)
	
	힘들었던 부분
	1. 문제 이해를 제대로 하지 못함
	     이진 트리가 양쪽 모두 트리 형태를 만족해야만 하는 조건인줄 알았던 부분
	     좌우측 비교 대상이 바로 위 상위 노드만 판정하면 되는줄 알았던 부분
	
	공부가 필요한 부분
	1. 이진트리의 개념 및 종류에 대해서 공부가 필요하다고 느꼈습니다.
	
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
