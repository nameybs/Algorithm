package com.test;


public class Solution_344 {
	/**
	�ؿ䱸����
	reverse string ���� space complexity �� O(1)�� �Ǿ���Ѵ�
	�ع��
	1. �ݺ����� ���� �迭�� ��Ҹ� �����Ѵ�
	time complexity O(NlogN)
	space complexity O(N)
	2. �����ε����� �ε��� �Ķ���͸� ���� �޼ҵ带 �̿��� ���ȣ���Ѵ�
	time complexity O(NlogN)
	space complexity O(N)
	**/
	
    public char[] reverseString(char[] s) {
    	return reverseString(s, 0);
    }
    
    public char[] reverseString(char[] s, int idx) {
    	if(idx < s.length / 2) {
			char temp1 = s[idx];
			s[idx] = s[(s.length - 1) - idx];
			s[(s.length - 1) - idx] = temp1;
			reverseString(s, idx + 1);
    	}
		return s;
    }
}
