package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_111 {
	/**
	�ؿ䱸����
	���� Ʈ���� �־����� �ּ� ���̸� ã���ʽÿ�.
	�ּ� ���̴� ��Ʈ ��忡�� ���� ����� ���� ������ �ִ� ��θ� ���� �ִ� ����� ���Դϴ�.
	����: ������ �ڽ��� ���� ����Դϴ�.
	
	�ع��
	1. �ִ� ��� �˻� �����̱� ������ bfs�� ���
	2. root��尡 null�� ��� 0�� ��ȯ
	3. root��忡 �ڽĳ�尡 ��� null�� ��� 1�� ��ȯ
	4. ��带 queue�� �ְ� Ž��
	5. ���� ��忡 leaf��尡 �ִ� ��쿡 �ش� ���̸� ��ȯ
	6. ���ʸ� leaf��尡 �ִ� ��쿡�� ���� ��尡 �����ų� ����� ���������� ��� Ž��
	
	time complexity O(N)
	space complexity O(N)
	**/
	
    public int minDepth(TreeNode root) {
    	if(root == null) return 0;
    	if(root.left == null && root.right == null) return 1;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.offer(root);
    	int dept = 0;
		while(!queue.isEmpty()) {
			dept++;
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode cur = queue.poll();
				if(cur.left == null && cur.right == null) return dept;
				if(cur.left != null) queue.offer(cur.left);
				if(cur.right != null) queue.offer(cur.right);
			 }
		}
    	return dept;
    }
}
