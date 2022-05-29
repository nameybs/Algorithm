package com.test;

public class Solution_509 {
	/**
	�ؿ䱸����
	�Ϲ������� F(n)���� ǥ�õǴ� �Ǻ���ġ ������ �Ǻ���ġ �����̶�� �ϴ� 
	������ �����ϹǷ� �� ���� 0�� 1���� �����ϴ� ���� �� ���� ���Դϴ�. 
	�ع��
	�迭�ε����� ���� �迭�ε����� ���� ������ ������ ó��
	�޸������̼��� �̿��ؼ� �ݺ������� ������ ó���� ���� ����� ���� ���
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
