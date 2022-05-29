package com.test;

public class Solution_509 {
	/**
	※요구사항
	일반적으로 F(n)으로 표시되는 피보나치 수열은 피보나치 수열이라고 하는 
	수열을 형성하므로 각 수는 0과 1에서 시작하는 앞의 두 수의 합입니다. 
	※방법
	배열인덱스를 만들어서 배열인덱스의 값을 가지고 연산을 처리
	메모이제이션을 이용해서 반복적으로 들어오는 처리에 대해 저장된 값을 사용
	time complexity O(N)
	space complexity O(1)
	**/
	public static int[] buf = new int[30];
	
    public int fib(int n) {
		if (n <= 1) return n;
		if (buf[n] != 0) return buf[n];
		return buf[n] = fib(n - 1) + fib(n - 2);
    }
}
