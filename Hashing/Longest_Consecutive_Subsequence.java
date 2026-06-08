class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) 
    {
        int n = arr.length;
        int currLen = 0;
        int maxLen = 0;
        
        Set<Integer> uniq = new HashSet<>();
        
        for(int x : arr)
            uniq.add(x);
            
        for(int x : arr)
        {
            if(!uniq.contains(x-1))
            {
                currLen = 1;
                int curr = x;
                while(uniq.contains(curr+1))
                {
                    currLen++;
                    curr++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        
        return maxLen;
    }
}
