package Tries;/*
    @author jadon
*/

import java.util.HashMap;

class Trie {

    public static class Node{
        char ch ;
        HashMap<Character, Node> children;
        boolean isTerminal;
        public Node(char ch){
            this.ch = ch;
            this.children = new HashMap<>();
            this.isTerminal = false;
        }
    }

    private Node root ;


    public Trie() {
        this.root = new Node('*');
    }

    public void insert(String word) {
        Node cur = this.root;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(cur.children.containsKey(ch)) cur = cur.children.get(ch);
            else{
                Node node = new Node(ch);
                cur.children.put(ch, node);
                cur = node;
            }
        }
        cur.isTerminal = true;
    }

    public boolean search(String word) {
        Node cur = this.root;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(cur.children.containsKey(ch)) cur = cur.children.get(ch);
            else return false;
        }
        return cur.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node cur = this.root;
        for(int i = 0 ; i < prefix.length() ; i++){
            char ch = prefix.charAt(i);
            if(cur.children.containsKey(ch)) cur = cur.children.get(ch);
            else return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
