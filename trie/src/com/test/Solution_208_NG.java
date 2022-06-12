package com.test;

import java.util.LinkedList;
import java.util.List;

/**
Runtime : 1146ms
Memory : 150.1 MB
*/
public class Solution_208_NG {

	//肋给等 规过
	private List<String> list;;
	
	public Solution_208_NG() {
		list = new LinkedList<String>();
	}
	
	/**
	 * time complexity O(1)
	 * space complexity O(N)
	 * @param word
	 */
	public void insert(String word) {
		list.add(word);
	}
	
	/**
	 * time complexity O(N)
	 * space complexity O(N)
	 * @param word
	 * @return
	 */
	public boolean search(String word) {
		for (String value : list) {
			if(value.equals(word)) return true;
		}
	
	    return false;
	}
	
	/**
	 * time complexity O(N)
	 * space complexity O(N)
	 * @param prefix
	 * @return
	 */
	public boolean startsWith(String prefix) {
		for (String value : list) {
			if(value.length() > prefix.length()) {
				if(value.substring(0, prefix.length()).equals(prefix)) return true;
			} else if(value.length() == prefix.length()) {
				if(value.equals(prefix)) return true;
			}
		}
	    return false;
	}
}
