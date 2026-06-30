class Solution {
    public int numberOfSubstrings(String s) 
    {
        int n = s.length();
        int[] alphaFreq = new int[3];
        int head = 0;
        int tail = 0;
        int count = 0;

        while(tail <= head && head < n)
        {
            alphaFreq[s.charAt(head) - 'a']++;
            
            if(alphaFreq[0] > 0 &&
               alphaFreq[1] > 0 &&
               alphaFreq[2] > 0)
            {
                count += n-head;

                while(tail < head)
                {
                    alphaFreq[s.charAt(tail) - 'a']--;
                    tail++;

                    if(alphaFreq[s.charAt(tail-1) - 'a'] > 0)
                        count += n-head;
                    else
                        break;            
                }
            }
            
            head++;
        }

        return count;     
    }
}
