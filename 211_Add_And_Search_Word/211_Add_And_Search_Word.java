public class WordDictionary {
    private WordNode root = new WordNode();
    
    public class WordNode{
        boolean end;
        HashMap<Character, WordNode> children = new HashMap<Character, WordNode>();
    }
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        WordNode node = root;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(!node.children.containsKey(c)) node.children.put(c, new WordNode());
            node = node.children.get(c);
        }
        node.end = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(word.toCharArray(), 0, root);
    }
    
    private boolean search(char []arr, int index, WordNode parent){
        if(index == arr.length){
            if(parent.end == true) return true;
            else return false;
        }
        if(arr[index] == '.'){
            for(WordNode node: parent.children.values()){
                boolean b = search(arr, index+1, node);
                if(b) return true;
            }
        }else{
            if(parent == null || !parent.children.containsKey(arr[index])) return false;
            else return search(arr, index+1, parent.children.get(arr[index]));
        }
        return false;
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
