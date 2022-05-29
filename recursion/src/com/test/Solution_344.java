package com.test;


public class Solution_344 {
	/**
	※요구사항
	reverse string 에서 space complexity 가 O(1)이 되어야한다
	※방법
	1. 반복문을 돌며 배열의 요소를 스왑한다
	time complexity O(NlogN)
	space complexity O(N)
	2. 오버로딩으로 인덱스 파라미터를 가진 메소드를 이용해 재귀호출한다
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
