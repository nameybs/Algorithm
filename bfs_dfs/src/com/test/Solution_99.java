package com.test;

public class Solution_99 {
	/**
	�ؿ䱸����
	BST(���� �˻� Ʈ��)�� ��Ʈ�� �����Ǹ� Ʈ���� ��Ȯ�� �� ��� ���� �Ǽ��� ��ȯ�Ǿ����ϴ�. 
	������ �������� �ʰ� Ʈ���� �����մϴ�.
	
	Input: root = [1,3,null,null,2]
	Output: [3,1,null,null,2]
	����: 3�� 3 > 1�̹Ƿ� 1�� ���� �ڽ��� �� �� �����ϴ�. 1�� 3�� �ٲٸ� BST�� ��ȿ�մϴ�.
	
	�ع��
	1. �ٲ� ����� ��带 ���������� ���� temp1, temp2
	2. ����� ������  
	����� ���� root����� ������ ū�� ����
	3. 
	
	time complexity O(N)
	space complexity O(N)
	**/
	private TreeNode temp1;
	private TreeNode temp2;
	private TreeNode buf;
	
    public void recoverTree(TreeNode root) {
    	if(root == null) return;
    	
    	temp1 = null;
    	temp2 = null;
    	buf = null;
    	
    	recoverTree2(root);
    	int temp = temp1.val;
    	temp1.val = temp2.val;
    	temp2.val = temp;
    }
    
    public void recoverTree2(TreeNode root) {
        if (root == null) return;
        recoverTree2(root.left);
        if (temp1 == null && (buf == null || buf.val >= root.val)) temp1 = buf;
        if(temp1 != null && buf.val >= root.val) temp2 = root;
        buf = root;
        recoverTree2(root.right);
    }
}
