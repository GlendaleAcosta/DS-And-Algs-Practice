package ds.Tries.TrieImplementation;

public class Trie {
    final int ALPHABET_SIZE = 26;
    TrieNode root;

    public void insert(String key) {
        int length = key.length();
        int index;

        TrieNode pcrawl = root;
        for(int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pcrawl.children[index] == null)
                pcrawl.children[index] = new TrieNode();

            pcrawl = pcrawl.children[index];
        }

        pcrawl.isEndOfWord = true;
    }

    public boolean search(String key) {
        int length = key.length();
        int index;
        TrieNode pcrawl = root;

        for(int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pcrawl.children[index] == null)
                return false;

            pcrawl = pcrawl.children[index];
        }

        return (pcrawl != null && pcrawl.isEndOfWord);
    }
}

