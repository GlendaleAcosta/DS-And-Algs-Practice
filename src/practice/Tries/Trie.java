package practice.Tries;

public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insertWord(String word) {
        int length = word.length();
        int i;
        Node node = root;
        for(int level = 0; level < length; level++) {
            i = word.charAt(level) - 'a';
            if (node.children[i] == null) {
                node.children[i] = new Node();
            }
            node = node.children[i];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        int length = word.length();
        int i;
        Node node = root;
        for(int level = 0; level < length; level++) {
            i = word.charAt(level) - 'a';
            if (node.children[i] == null) {
                System.out.println("false");
                return false;
            }
            node = node.children[i];
        }
        System.out.println(node != null && node.isEndOfWord);
        return (node != null && node.isEndOfWord);
    }
}
