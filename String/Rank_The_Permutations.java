class Solution {
    public long findRank(String s) 
    {
        int n = s.length();
        long rank = 0;
        
        for(int i = 0; i < n; i++)
        {
            char x = s.charAt(i);
            int lowerCnt = 0;
            
            for(int j = i; j < n; j++)
                if(s.charAt(j) < x)
                    lowerCnt++;
                    
            rank += lowerCnt*fact(n-i-1);
        }
        
        return rank+1;
    }
    
    private long fact(int n)
    {
        if(n == 0 || n == 1)
            return 1;
            
        return n*fact(n-1);
    }
}
