package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_119 {
	/**
	※요구사항
      정수 rowIndex가 주어지면 Pascal 삼각형의 rowIndexth(0인덱스) 행을 반환합니다.
      파스칼의 삼각형에서 각 숫자는 다음과 같이 바로 위에 있는 두 숫자의 합입니다.
	※방법
	1. rowIndex가존재하지 않을 경우 부르트포스 방식 사용
	2. 처리 결과를 map에 담아서 다음 처리시에 rowIndex가 존재하면 해당 값을 반환
	3. rowIndex가 존재하지 않을 경우 직전 처리의 가장 높은값부터 처리를 시작
	time complexity O(N^2)
	space complexity O(N)
	**/
	public static Map<Integer,List<Integer>> buf = new HashMap<Integer,List<Integer>>();
	public static int maxRow = 0;
	
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> prev = null;
    	List<Integer> result = new ArrayList<Integer>();
    	int start = maxRow;
    	if(buf.containsKey(rowIndex)) return buf.get(rowIndex);
    	result.add(1);

    	for (int i = start; i <= rowIndex; i++) {
			prev = result;
			result = new ArrayList<Integer>();
			result.add(1);
			if(i > 0) {
				if(i > 1) result.add(i);
				if(buf.containsKey(i)) {
					result = buf.get(i);
				} else {
					int idx = i % 2 == 0 ? (i / 2) + 1 : (i + 1) / 2;
					for (int j = 2; j < idx; j++) {
						if(i % 2 == 1) {
							result.add(prev.get(j - 1) + prev.get(j));
						} else {
							if(j == idx - 1) {
								result.add(prev.get(j - 1) + prev.get(j - 1));
							} else if(j < idx) {
								result.add(prev.get(j - 1) + prev.get(j));
							}
						}
					}
					for (int j = result.size() - 1; j >= 0; j--) {
						if(i % 2 == 0 && j == result.size() - 1) continue;
						result.add(result.get(j));
					}
				}
				buf.put(i, result);
				if(maxRow < rowIndex) maxRow = rowIndex;
			}
		}
    	return result;
    }
}
