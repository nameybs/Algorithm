package com.test;

public class Solution_24 {
	/**
	�ؿ䱸����
       ����� ����� �־����� ������ �� ��带 ��� ��ȯ�ϰ� ��带 ��ȯ�մϴ�. 
       ����� ��忡 �ִ� ���� �������� �ʰ� ������ �ذ��ؾ� �մϴ�(��, ��� ��ü�� ����� �� ����).
	�ع��
	�ݺ����� ���� ����� ��Ҹ� �����Ѵ�
	time complexity O(NlogN)
	space complexity O(N)
	**/
    public ListNode swapPairs(ListNode head) {
    	
    	if((head == null) || (head.next == null)) return head;
    	ListNode result = new ListNode(-1, head);
    	ListNode prev = result;
    	while(prev.next != null && prev.next.next != null) {
    		int temp = prev.next.val;
    		prev.next.val = prev.next.next.val;
    		prev.next.next.val = temp; 
    		prev = prev.next.next;
    	}
		return result.next;
    }
}
