package practice.Tries;

public class App {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("hello");
        trie.insertWord("help");
        trie.insertWord("heliocentric");
        trie.insertWord("monkey");
        trie.insertWord("monday");
        trie.insertWord("monster");
        trie.search("hello");
        trie.search("monkey");
        trie.search("rubber");
    }
}
