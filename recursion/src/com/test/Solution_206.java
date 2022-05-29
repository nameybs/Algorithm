package com.test;

public class Solution_206 {
	/**
	※요구사항
       단일 연결 목록의 머리가 주어지면 목록을 뒤집고 역 목록을 반환합니다.
	※방법
	1. 반환값 노드를 생성한다
	2. 반복문 처리용 노드를 만들고 인자값을 대입한다.
	3. 인덱스를 변환하기 위한 노드를 만들고 인자값을 대입한다.
	반복문 처리
	4. 노드의 인덱스를 뒤로 한칸씩 민다 1/2345 -> 2/345
	5. 반환 노드를 반복문 처리용 노드에 대입한다 1/2345 -> 1/null
	6. 반복문 처리용 노드를 반환 노드에 대입한다  null -> 1/null
	7. 인덱스를 변환한 노드를 반복문 처리용 노드에 대입한다 1/null -> 2/345
	
	결과값의 대입 순서
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
