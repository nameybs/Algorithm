package com.test;

public class Solution_21 {
	/**
	※요구사항
	두 개의 정렬된 연결 목록 list1과 list2의 헤드가 제공됩니다.
	두 개의 목록을 하나의 정렬된 목록으로 병합합니다. 목록은 처음 두 목록의 노드를 연결하여 만들어야 합니다.
	병합된 연결 목록의 헤드를 반환합니다.
	
	두 목록의 노드 수는 [0, 50] 범위에 있습니다.
	-100 <= Node.val <= 100
	list1과 list2는 모두 내림차순으로 정렬됩니다.
	
	※방법
	1.인자값이 모두 null일 경우에는 그대로 리턴
	2.인자값이 둘중 하나가 null일 경우 null이 아닌 인자값을 리턴
	3.buf를 생성해서 list의 비교결과를 하나씩 담아놓는다.
	4.buf에 담긴 값은 버리고 다음 값을 반복해서 비교해 나간다
	5.한쪽의 list의 비교값이 null이 되었을 경우 남은 list를 buf의 마지막 부분에 모두 추가한다.
	
	※고민했던 부분
	buf를 사용하지 않고 list1을 기준으로 데이터를 추가하는 방식을 사용 해보고 싶었으나
	list1의 마지막 노드가 null일 경우 list2의 남은 값을 추가하려고 할 때 주소값을 찾을 수 없어서
	구현하지 못했습니다.
	
	time complexity O(N)
	space complexity O(N)
	**/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if(list1 == null && list2 == null) return null;
        if(list2 == null) return list1;
        if(list1 == null) return list2;
        
        ListNode buf = new ListNode();
    	ListNode result = buf;

    	while(list1 != null && list2 != null) {
    		if(list1.val < list2.val) {
    			buf.next = list1;
    			list1 = list1.next;
    		} else {
    			buf.next = list2;
    			list2 = list2.next;
    		}
    		buf = buf.next;
    	}
    	
    	if(list1 != null) buf.next = list1;
    	else buf.next = list2;
    	
    	return result.next;
    }
}
