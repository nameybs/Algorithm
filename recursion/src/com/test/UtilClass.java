package com.test;

import java.util.List;

public class UtilClass {
	public static void printCharArray(char[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
	}
	
    public static void printList(ListNode head) {
    	while(head != null) {
    		System.out.print(head.val);
    		head = head.next;
    	}
    	System.out.println();
    }
    
    public static void printList(List<Integer> list) {
		System.out.println(list);
    }
}
