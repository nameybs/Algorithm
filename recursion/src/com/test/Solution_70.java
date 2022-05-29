package com.test;

public class Solution_70 {
	/**
	※요구사항
	당신은 계단을 오르고 있습니다. 정상에 도달하려면 n 단계가 필요합니다.
	매번 1 또는 2개의 계단을 오를 수 있습니다. 얼마나 많은 독특한 방법으로 정상에 오를 수 있습니까?
	※방법
	피보나치 수열의 응용 문제인것같아서 같은 방식으로 풀었습니다.
	n = 2
	1. 1 + 1
	2. 2
	
	n = 3
	1. (1 + 1) + 1
	2. 1 + (2)
	3. 2 + 1
	
	n = 4
	1. (1 + 1 + 1) + 1
	2. (1 + 2) + 1
	3. 1 + 1 + 2
	4. (2 + 1) + 1
	5. 2 + 2
	
	n = 5
	1. (1 + 1 + 1 + 1) + 1
	2. (1 + 2 + 1) + 1
	3. (1 + 1 + 2) + 1
	4. 1 + 1 + 1 + 2
	5. (2 + 1 + 1) + 1
	6. 1 + (2 + 2)
	7. 2 + 1 + 2
	8. 2 + 2 + 1
	
	time complexity O(N)
	space complexity O(1)
	**/
	public static int[] buf = new int[46];
	
    public int climbStairs(int n) {
		if (n <= 2) return n;
		if (buf[n] != 0) return buf[n];
		return buf[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }
}
