package com.test;

/**
※요구사항
트라이("try"로 발음) 또는 접두사 트리는 문자열 데이터 세트에서 키를 
효율적으로 저장하고 검색하는 데 사용되는 트리 데이터 구조입니다. 
자동 완성 및 맞춤법 검사기와 같은 이 데이터 구조의 다양한 응용 프로그램이 있습니다.

Tri 클래스를 구현합니다.
Trie() tri 개체를 초기화합니다.
void insert(String word) 문자열 단어를 트라이에 삽입합니다.
boolean search(String word) 문자열 단어가 trie에 있으면(즉, 이전에 삽입된 경우) true를 반환하고, 그렇지 않으면 false를 반환합니다.
boolean startsWith(String prefix) 접두어가 있는 이전에 삽입된 문자열 단어가 있으면 true를 반환하고 그렇지 않으면 false를 반환합니다.

※방법
1.알파벳을 저장할 노드를 생성한다.
2.알파벳의 갯수만큼의 노드를 가진 배열을 next이란 이름으로 선언하고 추가한 단어의 마지막 부분을 표시하기 위해 isWord를 선언한다.
3.단어 추가의 경우
3-1.문자열을 char형 배열로 쪼갠 뒤 반복문을 돌린다.
3-2.해당index가 null일 경우 해당 배열에 새로운 노드를 생성한다.
3-3.반복작업을 통해 추가한 노드의 마지막 depth에 도달했을 경우 마지막인것을 표시하기 위해 isWord를 true로 바꿔준다.
3-4.해당index가 null이 아닐 경우 다음 노드로 이동한다.
4.단어 검색의 경우
4-1.문자열을 마찬가지로 char형 배열로 쪼갠 후에 반복문을 통해 한문자열씩 노드의 index에서 검색한다.
4-2.검색한 index가 있는 경우 해당 index의 다음 노드로 가서 다음 index를 검색한다.
4-3.반복 작업을 통해서 마지막 depth를 찾고 해당 depth의 isWord가 true일 경우에는 문자열 검색 결과는 true반환
4-4.index를 검색 못했거나 검색한 마지막 depth의 isWord가 false일 경우에는 false반환
5.머릿글 일치 검색의 경우
5-1.단어 검색과 비슷하나 input문자열을 모두 검색했을때 true를 반환하도록 했다.

Runtime : 35ms
Memory : 52.2 MB

※후기
처음에는 단순하게 API를 이용해서 풀이를 했는데
Trie개념을 공부하고 다시 풀이했습니다.

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