class Solution {
    public long[] distance(int[] nums) 
    {
        int n = nums.length;
        long[] res = new long[n];
        
        // Step 1: group indices by value
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        
        // Step 2: process each group
        for (List<Integer> pos : map.values()) 
        {
            int size = pos.size();
            
            // prefix sum array
            long[] prefix = new long[size + 1];
            for (int i = 0; i < size; i++)
                prefix[i + 1] = prefix[i] + pos.get(i);
            
            for (int i = 0; i < size; i++) 
            {
                long currentIndex = pos.get(i);
                
                // left side
                long left = currentIndex * i - prefix[i];
                
                // right side
                long right = (prefix[size] - prefix[i + 1]) 
                             - currentIndex * (size - i - 1);
                
                res[pos.get(i)] = left + right;
            }
        }
        
        return res;
    }
}
