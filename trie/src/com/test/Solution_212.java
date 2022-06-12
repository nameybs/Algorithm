package com.test;

import java.util.LinkedList;
import java.util.List;
/**
※요구사항
m x n 문자 보드와 문자열 단어 목록이 주어지면 보드의 모든 단어를 반환합니다.
각 단어는 순차적으로 인접한 셀의 문자로 구성되어야 하며, 인접한 셀은 수평 또는 수직으로 인접합니다. 
동일한 문자 셀은 한 단어에서 두 번 이상 사용할 수 없습니다.

Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]

m == 보드 길이
n == 보드[i].길이
1 <= m, n <= 12
board[i][j]는 영문 소문자입니다.
1 <= 단어.길이 <= 3 * 104
1 <= 단어[i].길이 <= 10
단어[i]는 영문 소문자로 구성됩니다.
모든 단어 문자열은 고유합니다.

※방법
입력 문자열을 trie노드에 담고 dfs를 이용해서 탐색

**/
public class Solution_212 {
	TrieNode root;
	/**
	 * time complexity O(N)
	 * space complexity O(N)
	 * @param board
	 * @param words
	 * @return
	 */
    public List<String> findWords(char[][] board, String[] words) {
    	List<String> result = new LinkedList<String>();
    	root = new TrieNode();
    	
    	// ADD WORDS
    	insert(words);
    	
    	// SEARCH WORDS
    	for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				search(board, result, i , j);
			}
		}
        return result;
    }
    
    /**
	 * time complexity O(N)
	 * space complexity O(N^2)
     * @param words
     */
    public void insert(String[] words) {
        TrieNode temp = root;
        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
    			if(temp.next[ch[j] - 'a'] == null) {
    				temp.next[ch[j] - 'a'] = new TrieNode();
    			}
    			temp = temp.next[ch[j] - 'a'];
    			if(j == ch.length - 1) temp.isWord = true;
    		}
            temp.word = words[i];
		}
    }
    
    /**
	 * time complexity O(N)
	 * space complexity O(N)
     * @param board
     * @param result
     * @param i
     * @param j
     */
    public void search(char[][] board, List<String> result, int i, int j) {
    	TrieNode temp = root;
    	char c = board[i][j];
    	if(temp.next[c - 'a'] == null || c == '#') return;

    	if(temp.word != null) {
    		System.out.println(temp.word);
    		result.add(temp.word);
    		temp.word = null;
    	}
    	temp = temp.next[c - 'a'];
    	
    	board[i][j] = '#';
    	if(i > 0) search(board, result, i - 1, j);
    	if(j > 0) search(board, result, i, j - 1);
    	if(i < board.length - 1) search(board, result, i + 1, j);
    	if(j > board[0].length - 1) search(board, result, i, j + 1);
    	board[i][j] = 'c';
    }
}
