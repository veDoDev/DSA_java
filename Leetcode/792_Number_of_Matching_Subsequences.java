class Solution {
    class Node
    {
        String word;
        int index;
        Node(String word, int index)
        {
            this.word = word;
            this.index = index;
        }
    }
    public int numMatchingSubseq(String t, String[] words) 
    {
        int res = 0;
        int currBucket = 0;
        char nextChar;

        List<Node>[] buckets = new List[26];

        for(int i = 0;i < 26; i++)
        {
            buckets[i] = new ArrayList<>();
        }

        for(String w :words)
            buckets[w.charAt(0) - 'a'].add(new Node(w, 0));
        //   a     acd      ace
        //   bb  

        for(char c : t.toCharArray())
        {
            currBucket = c - 'a';
            List<Node> temp = buckets[currBucket];
            buckets[currBucket] = new ArrayList<>();
            for(Node n : temp)
            {
                n.index++;
                if(n.index == n.word.length())  res++;
                else
                {
                    nextChar = n.word.charAt(n.index);
                    buckets[nextChar - 'a'].add(n);
                }
            }
        }

        return res;
    }
}
