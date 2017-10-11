package ds.Tries.TrieImplementation;

public class TrieNode {
    TrieNode [] children;
    boolean isEndOfWord;

    public TrieNode() {
        this.children = new TrieNode[26];
        this.isEndOfWord = false;
    }
}
