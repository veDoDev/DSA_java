class Solution {
    public String mapWordWeights(String[] words, int[] weights) 
    {
        int n = words.length;
        StringBuilder res = new StringBuilder();

        for(String s: words)
        {
            int currSum = 0;
            for(char x : s.toCharArray())
                currSum += weights[x - 'a'];
            
            currSum %= 26;
            int addThis = 25 - currSum;
            res.append((char)(addThis + 'a'));
        }

        return res.toString();    
    }
}
