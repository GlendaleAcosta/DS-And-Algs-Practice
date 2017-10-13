package ds.Tries.TrieImplementation;

public class App {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertt("there");
        trie.insertt("these");
        trie.search("there");
        trie.search("these");
        trie.search("they");
        trie.insertt("they");
        trie.search("they");
    }
}
