package ds.Tries.TrieImplementation;

public class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insertt(String word) {
        TrieNode curr = root;

        for(int level = 0; level < word.length(); level++) {
            char c = word.charAt(level);
            int i = c - 'a';
            if (curr.children[i] == null)
                curr.children[i] = new TrieNode();
            curr = curr.children[i];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;

        for(int level = 0; level < word.length(); level++) {
            char c = word.charAt(level);
            int i = c - 'a';
            if (curr.children[i] == null) {
                System.out.println("'" + word + "' is NOT in the trie.");
                return false;
            }
            curr = curr.children[i];
        }
        System.out.println("'" + word + "' is in the trie.");
        return curr.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for(int level = 0; level < prefix.length(); level++) {
            char c = prefix.charAt(level);
            int i = c - 'a';
            if (curr.children[i] == null) {
                return false;
            }
            curr = curr.children[i];
        }
        return true;
    }
}
