package com.test;

public class Solution_24 {
	/**
	※요구사항
       연결된 목록이 주어지면 인접한 두 노드를 모두 교환하고 헤드를 반환합니다. 
       목록의 노드에 있는 값을 수정하지 않고 문제를 해결해야 합니다(즉, 노드 자체만 변경될 수 있음).
	※방법
	반복문을 돌며 노드의 요소를 스왑한다
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
