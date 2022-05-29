package com.test;

public class Solution_21 {
	/**
	�ؿ䱸����
	�� ���� ���ĵ� ���� ��� list1�� list2�� ��尡 �����˴ϴ�.
	�� ���� ����� �ϳ��� ���ĵ� ������� �����մϴ�. ����� ó�� �� ����� ��带 �����Ͽ� ������ �մϴ�.
	���յ� ���� ����� ��带 ��ȯ�մϴ�.
	
	�� ����� ��� ���� [0, 50] ������ �ֽ��ϴ�.
	-100 <= Node.val <= 100
	list1�� list2�� ��� ������������ ���ĵ˴ϴ�.
	
	�ع��
	1.���ڰ��� ��� null�� ��쿡�� �״�� ����
	2.���ڰ��� ���� �ϳ��� null�� ��� null�� �ƴ� ���ڰ��� ����
	3.buf�� �����ؼ� list�� �񱳰���� �ϳ��� ��Ƴ��´�.
	4.buf�� ��� ���� ������ ���� ���� �ݺ��ؼ� ���� ������
	5.������ list�� �񱳰��� null�� �Ǿ��� ��� ���� list�� buf�� ������ �κп� ��� �߰��Ѵ�.
	
	�ذ���ߴ� �κ�
	buf�� ������� �ʰ� list1�� �������� �����͸� �߰��ϴ� ����� ��� �غ��� �;�����
	list1�� ������ ��尡 null�� ��� list2�� ���� ���� �߰��Ϸ��� �� �� �ּҰ��� ã�� �� ���
	�������� ���߽��ϴ�.
	
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
