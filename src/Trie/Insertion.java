package Trie;



public class Insertion {
    private TrieNode root;
    public Insertion() {
        root= new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if (current.childern[index]==null){
                current.childern[index]=new TrieNode();
            }
            current=current.childern[index];
        }
        current.isEndOfWord=true;

    }

    // Delete
    public void delete(String word) {
        delete(root, word, 0);
    }

    private boolean delete(TrieNode node, String word, int depth) {
        if (node == null)
            return false;

        // Last character reached
        if (depth == word.length()) {

            if (!node.isEndOfWord)
                return false; // Word doesn't exist

            node.isEndOfWord = false;

            // Delete this node if it has no children
            return isEmpty(node);
        }

        int index = word.charAt(depth) - 'a';

        if (delete(node.childern[index], word, depth + 1)) {
            node.childern[index] = null;

            // Delete current node if it's not end of another word
            return !node.isEndOfWord && isEmpty(node);
        }

        return false;
    }

    private boolean isEmpty(TrieNode node) {
        for (TrieNode child : node.childern) {
            if (child != null)
                return false;
        }
        return true;
    }
}


class TrieNode {
    TrieNode [] childern;
    boolean isEndOfWord;

    public TrieNode() {
        this.childern = new TrieNode[26];
        this.isEndOfWord = false;
    }


}
