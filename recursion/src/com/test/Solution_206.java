package com.test;

public class Solution_206 {
	/**
	�ؿ䱸����
       ���� ���� ����� �Ӹ��� �־����� ����� ������ �� ����� ��ȯ�մϴ�.
	�ع��
	1. ��ȯ�� ��带 �����Ѵ�
	2. �ݺ��� ó���� ��带 ����� ���ڰ��� �����Ѵ�.
	3. �ε����� ��ȯ�ϱ� ���� ��带 ����� ���ڰ��� �����Ѵ�.
	�ݺ��� ó��
	4. ����� �ε����� �ڷ� ��ĭ�� �δ� 1/2345 -> 2/345
	5. ��ȯ ��带 �ݺ��� ó���� ��忡 �����Ѵ� 1/2345 -> 1/null
	6. �ݺ��� ó���� ��带 ��ȯ ��忡 �����Ѵ�  null -> 1/null
	7. �ε����� ��ȯ�� ��带 �ݺ��� ó���� ��忡 �����Ѵ� 1/null -> 2/345
	
	������� ���� ����
	1. 1/null
	2. 2/1/null
	3. 3/2/1/null
	4. 4/3/2/1/null
	5. 5/4/3/2/1/null
	
	time complexity O(N)
	space complexity O(N)
	**/
    public ListNode swapPairs(ListNode head) {
    	
    	if((head == null) || (head.next == null)) return head;
    	ListNode result = null;
    	ListNode buf = head;
    	ListNode foward = head;

    	while(buf != null) {
    		foward = foward.next; // head
    		buf.next = result; // result
    		result = buf; // result
    		buf = foward; // head
    	}
		return result;
    }
}
