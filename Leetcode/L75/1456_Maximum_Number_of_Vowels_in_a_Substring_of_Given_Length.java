class Solution {
    public int maxVowels(String s, int k) 
    {
        int[] alpha = new int[26];
        int streak = 0;
        int maxStreak = 0;
        int tail = 1;
        int head = k;

        alpha[0] = 1;
        alpha[4] = 1;
        alpha[8] = 1;
        alpha[14] = 1;
        alpha[20] = 1;


        //construct sliding window
        for(int i = 0; i < k; i++)
        {
            if(alpha[s.charAt(i) - 'a'] == 1)
                streak++;         
        }
        maxStreak = streak;

        while(head < s.length())
        {
            if(alpha[s.charAt(tail-1) - 'a'] == 1)
                streak--;
            if(alpha[s.charAt(head) - 'a'] == 1)
                streak++;
            
            maxStreak = Math.max(streak, maxStreak); 
            tail++;
            head++;         
        }

        return maxStreak;


               
    }
}
