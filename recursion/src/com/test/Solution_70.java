package com.test;

public class Solution_70 {
	/**
	�ؿ䱸����
	����� ����� ������ �ֽ��ϴ�. ���� �����Ϸ��� n �ܰ谡 �ʿ��մϴ�.
	�Ź� 1 �Ǵ� 2���� ����� ���� �� �ֽ��ϴ�. �󸶳� ���� ��Ư�� ������� ���� ���� �� �ֽ��ϱ�?
	�ع��
	�Ǻ���ġ ������ ���� �����ΰͰ��Ƽ� ���� ������� Ǯ�����ϴ�.
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
