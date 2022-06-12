package com.test;

/**
�ؿ䱸����
Ʈ����("try"�� ����) �Ǵ� ���λ� Ʈ���� ���ڿ� ������ ��Ʈ���� Ű�� 
ȿ�������� �����ϰ� �˻��ϴ� �� ���Ǵ� Ʈ�� ������ �����Դϴ�. 
�ڵ� �ϼ� �� ����� �˻��� ���� �� ������ ������ �پ��� ���� ���α׷��� �ֽ��ϴ�.

Tri Ŭ������ �����մϴ�.
Trie() tri ��ü�� �ʱ�ȭ�մϴ�.
void insert(String word) ���ڿ� �ܾ Ʈ���̿� �����մϴ�.
boolean search(String word) ���ڿ� �ܾ trie�� ������(��, ������ ���Ե� ���) true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�մϴ�.
boolean startsWith(String prefix) ���ξ �ִ� ������ ���Ե� ���ڿ� �ܾ ������ true�� ��ȯ�ϰ� �׷��� ������ false�� ��ȯ�մϴ�.

�ع��
1.���ĺ��� ������ ��带 �����Ѵ�.
2.���ĺ��� ������ŭ�� ��带 ���� �迭�� next�̶� �̸����� �����ϰ� �߰��� �ܾ��� ������ �κ��� ǥ���ϱ� ���� isWord�� �����Ѵ�.
3.�ܾ� �߰��� ���
3-1.���ڿ��� char�� �迭�� �ɰ� �� �ݺ����� ������.
3-2.�ش�index�� null�� ��� �ش� �迭�� ���ο� ��带 �����Ѵ�.
3-3.�ݺ��۾��� ���� �߰��� ����� ������ depth�� �������� ��� �������ΰ��� ǥ���ϱ� ���� isWord�� true�� �ٲ��ش�.
3-4.�ش�index�� null�� �ƴ� ��� ���� ���� �̵��Ѵ�.
4.�ܾ� �˻��� ���
4-1.���ڿ��� ���������� char�� �迭�� �ɰ� �Ŀ� �ݺ����� ���� �ѹ��ڿ��� ����� index���� �˻��Ѵ�.
4-2.�˻��� index�� �ִ� ��� �ش� index�� ���� ���� ���� ���� index�� �˻��Ѵ�.
4-3.�ݺ� �۾��� ���ؼ� ������ depth�� ã�� �ش� depth�� isWord�� true�� ��쿡�� ���ڿ� �˻� ����� true��ȯ
4-4.index�� �˻� ���߰ų� �˻��� ������ depth�� isWord�� false�� ��쿡�� false��ȯ
5.�Ӹ��� ��ġ �˻��� ���
5-1.�ܾ� �˻��� ����ϳ� input���ڿ��� ��� �˻������� true�� ��ȯ�ϵ��� �ߴ�.

Runtime : 35ms
Memory : 52.2 MB

���ı�
ó������ �ܼ��ϰ� API�� �̿��ؼ� Ǯ�̸� �ߴµ�
Trie������ �����ϰ� �ٽ� Ǯ���߽��ϴ�.

**/
public class Solution_208 {
	
	TrieNode root;
	public Solution_208() {
		root = new TrieNode();
	}
	
	/**
     * time complexity O(N)
	 * space complexity O(N)
	 * @param word
	 */
    public void insert(String word) {
        TrieNode temp = root;
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length; i++) {
			if(temp.next[ch[i] - 'a'] == null) {
				temp.next[ch[i] - 'a'] = new TrieNode();
			}
			temp = temp.next[ch[i] - 'a'];
			if(i == ch.length - 1) temp.isWord = true;
		}
    }
    
    /**
     * time complexity O(N)
	 * space complexity O(N)
     * @param word
     * @return
     */
    public boolean search(String word) {
    	TrieNode temp = root;
    	char[] ch = word.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if(temp.next[ch[i] - 'a'] == null) return false;
			temp = temp.next[ch[i] - 'a'];
		}
    	return temp.isWord;
    }
    
    /**
     * time complexity O(N)
	 * space complexity O(N)
     * @param prefix
     * @return
     */
    public boolean startsWith(String prefix) {
    	TrieNode temp = root;
    	char[] ch = prefix.toCharArray();
    	for (int i = 0; i < ch.length; i++) {
			if(temp.next[ch[i] - 'a'] == null) return false;
			temp = temp.next[ch[i] - 'a'];
		}
        return true;
    }
}