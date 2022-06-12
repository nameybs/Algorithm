package com.test;

import java.util.List;
/**
�ؿ䱸����
�ﰢ�� �迭�� �־����� ������ �Ʒ��� �ּ� ��� �հ踦 ��ȯ�մϴ�.
�� �ܰ迡 ���� �Ʒ� ���� ������ ��ȣ�� �̵��� �� �ֽ��ϴ�. ���� ����������, 
���� ���� �ε��� i�� �ִ� ��� ���� ���� �ε��� i �Ǵ� �ε��� i + 1�� �̵��� �� �ֽ��ϴ�.

O(n) �߰� ������ ����Ͽ� �� �۾��� ������ �� �ֽ��ϱ�? ���⼭ n�� �ﰢ���� �� �� ���Դϴ�.

�ع��
������ �ε������� ���ʴ�� �ö���鼭 �հ谡 ���� ������ ������ ��ġ�ϵ��� �Ѵ�.

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
