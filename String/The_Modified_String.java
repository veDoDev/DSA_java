class Solution {
    public int modified(String s) 
    {
        int n = s.length();
        int insertions = 0;
        
        for(int i = 0; i < n; i++)
        {
            int streak = 1;
            while(i+1 < n && s.charAt(i) == s.charAt(i+1))
            {
                i++;
                streak++;
            }

            if(streak >= 3)
                insertions += (streak-1)/2;
        }
        
        return insertions;
    }
} 
