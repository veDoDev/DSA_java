class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) 
    {
        int n = queries.length;
        int m = dictionary.length;
        List<String> res = new ArrayList<>();
        int wordL = queries[0].length();
        int diffCnt = 0;

        for(int i = 0; i < n; i++)
        {
            String curr = queries[i];
            
            for(int j = 0; j < m; j++)
            {
                String currDict = dictionary[j];
                diffCnt = 0;

                for(int k = 0; k < wordL; k++)
                    if(currDict.charAt(k) != curr.charAt(k))
                        diffCnt++;
                
                if(diffCnt <= 2)
                {
                    res.add(curr);
                    break;
                }
            }
        }

        return res;
    }
}
