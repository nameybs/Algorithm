package com.test;

class TrieNode {
    boolean isWord;
    String word;
    TrieNode[] next;
    
    public TrieNode() {
        this.next = new TrieNode[26];
    }
}