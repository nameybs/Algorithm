package com.test;

import java.util.LinkedList;
import java.util.List;
/**
�ؿ䱸����
m x n ���� ����� ���ڿ� �ܾ� ����� �־����� ������ ��� �ܾ ��ȯ�մϴ�.
�� �ܾ�� ���������� ������ ���� ���ڷ� �����Ǿ�� �ϸ�, ������ ���� ���� �Ǵ� �������� �����մϴ�. 
������ ���� ���� �� �ܾ�� �� �� �̻� ����� �� �����ϴ�.

Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]

m == ���� ����
n == ����[i].����
1 <= m, n <= 12
board[i][j]�� ���� �ҹ����Դϴ�.
1 <= �ܾ�.���� <= 3 * 104
1 <= �ܾ�[i].���� <= 10
�ܾ�[i]�� ���� �ҹ��ڷ� �����˴ϴ�.
��� �ܾ� ���ڿ��� �����մϴ�.

�ع��
�Է� ���ڿ��� trie��忡 ��� dfs�� �̿��ؼ� Ž��

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
