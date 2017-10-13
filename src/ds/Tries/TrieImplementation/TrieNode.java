package ds.Tries.TrieImplementation;

import java.util.HashMap;
import java.util.HashSet;

public class TrieNode {
    TrieNode [] children;
    boolean isEndOfWord;

    public TrieNode() {
        this.children = new TrieNode[26];
        isEndOfWord = false;
    }

}
