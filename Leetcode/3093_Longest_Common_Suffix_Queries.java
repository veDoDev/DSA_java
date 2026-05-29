class TrieNode {
    TrieNode[] children = new TrieNode[26];

    // best index for this prefix/suffix
    int idx = -1;
}

class Trie {

    TrieNode root = new TrieNode();
    String[] words;

    Trie(String[] wordsContainer) {
        this.words = wordsContainer;
    }

    private boolean better(int newIdx, int oldIdx) 
    {
        if (oldIdx == -1) return true;

        if (words[newIdx].length() < words[oldIdx].length())
            return true;

        if (words[newIdx].length() == words[oldIdx].length()
                && newIdx < oldIdx)
            return true;

        return false;
    }

    public void insert(String word, int idx) 
    {
        TrieNode curr = root;

        // update root answer (empty suffix case)
        if (better(idx, root.idx))
            root.idx = idx;

        for (int i = word.length() - 1; i >= 0; i--) 
        {
            char ch = word.charAt(i);
            int c = ch - 'a';

            if (curr.children[c] == null)
                curr.children[c] = new TrieNode();

            curr = curr.children[c];

            // update best answer at this node
            if (better(idx, curr.idx))
                curr.idx = idx;
        }
    }

    public int search(String word) 
    {
        TrieNode curr = root;

        for (int i = word.length() - 1; i >= 0; i--) 
        {
            char ch = word.charAt(i);
            int c = ch - 'a';

            if (curr.children[c] == null)
                break;

            curr = curr.children[c];
        }

        return curr.idx;
    }
}

class Solution {
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) 
    {
        Trie trie = new Trie(wordsContainer);

        // Build Trie
        for (int i = 0; i < wordsContainer.length; i++)
            trie.insert(wordsContainer[i], i);

        // Answer queries
        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) 
            ans[i] = trie.search(wordsQuery[i]);

        return ans;
    }
}
