package com.test;

import java.util.List;
/**
※요구사항
삼각형 배열이 주어지면 위에서 아래로 최소 경로 합계를 반환합니다.
각 단계에 대해 아래 행의 인접한 번호로 이동할 수 있습니다. 보다 공식적으로, 
현재 행의 인덱스 i에 있는 경우 다음 행의 인덱스 i 또는 인덱스 i + 1로 이동할 수 있습니다.

O(n) 추가 공간만 사용하여 이 작업을 수행할 수 있습니까? 여기서 n은 삼각형의 총 행 수입니다.

※방법
마지막 인덱스부터 차례대로 올라오면서 합계가 작은 순으로 앞으로 배치하도록 한다.

   2
  3 4
 6 5 7
4 1 8 3

(6+1)7 (5+1)6 (7+3)10
(6+3)9 (4+6)10
(9+2)11

**/
public class Solution_120 {
	
	/**
	 * time complexity O(N)
	 * space complexity O(N)
	 * @param triangle
	 * @return
	 */
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        int[] temp = new int[triangle.size()];

        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
			temp[i] = triangle.get(triangle.size() - 1).get(i);
		}
        
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= triangle.get(i).size() - 1 ; j++) {
                temp[j] = triangle.get(i).get(j) + Math.min(temp[j], temp[j + 1]);
            }
        }
        return temp[0];
    }
}
