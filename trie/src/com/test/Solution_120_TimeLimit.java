package com.test;

import java.util.List;
/**
�ؿ䱸����
�ﰢ�� �迭�� �־����� ������ �Ʒ��� �ּ� ��� �հ踦 ��ȯ�մϴ�.
�� �ܰ迡 ���� �Ʒ� ���� ������ ��ȣ�� �̵��� �� �ֽ��ϴ�. ���� ����������, 
���� ���� �ε��� i�� �ִ� ��� ���� ���� �ε��� i �Ǵ� �ε��� i + 1�� �̵��� �� �ֽ��ϴ�.

O(n) �߰� ������ ����Ͽ� �� �۾��� ������ �� �ֽ��ϱ�? ���⼭ n�� �ﰢ���� �� �� ���Դϴ�.

�ع��
��͸� ���ؼ� �ﰢ���� ���� ���� ���ؼ� �ּ� ���� ����
TimeLimit���� �߻�
��Ǯ�� ����

time complexity O(2N)
space complexity O(2N)

**/
public class Solution_120_TimeLimit {
	private Integer result = Integer.MAX_VALUE;
	
    public int minimumTotal(List<List<Integer>> triangle) {
    	minimumTotal(triangle, 0, 1, triangle.get(0).get(0));
    	return result;
    }
    
    public void minimumTotal(List<List<Integer>> triangle, int idx, int dept, int sum) {
    	System.out.println("SUM :" + sum);
    	if(triangle.size() == dept) {
    		if(result > sum) {
    			result = sum;
    		}
    	} else {
        	minimumTotal(triangle, idx, dept + 1, sum + triangle.get(dept).get(idx));
        	minimumTotal(triangle, idx + 1, dept + 1, sum + triangle.get(dept).get(idx + 1));
    	}
    }
}
