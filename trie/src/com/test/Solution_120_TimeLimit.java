package com.test;

import java.util.List;
/**
※요구사항
삼각형 배열이 주어지면 위에서 아래로 최소 경로 합계를 반환합니다.
각 단계에 대해 아래 행의 인접한 번호로 이동할 수 있습니다. 보다 공식적으로, 
현재 행의 인덱스 i에 있는 경우 다음 행의 인덱스 i 또는 인덱스 i + 1로 이동할 수 있습니다.

O(n) 추가 공간만 사용하여 이 작업을 수행할 수 있습니까? 여기서 n은 삼각형의 총 행 수입니다.

※방법
재귀를 통해서 삼각형의 양쪽 값을 구해서 최소 값을 산출
TimeLimit에러 발생
재풀이 예정

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
