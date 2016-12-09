class TrieNode {
    // Initialize your data structure here.
    public TrieNode() {
        children = new HashMap<Character, TrieNode>();
    }
    public HashMap<Character, TrieNode> children;
    public boolean end;
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!node.children.containsKey(c)) node.children.put(c, new TrieNode());
            node = node.children.get(c);
        }
        node.end = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(node == null || !node.children.containsKey(c)) return false;
            node = node.children.get(c);
        }
        return node.end;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if(node == null || !node.children.containsKey(c)) return false;
            node = node.children.get(c);
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
