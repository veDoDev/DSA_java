class Solution {
    public int[] frequencySort(int[] nums) 
    {
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int x : nums)
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
  
        Integer[] res = new Integer[n];
        for(int i = 0; i < n; i++)
            res[i] = nums[i];

        Arrays.sort(res, (a,b)->{
            int diff = freqMap.get(a) - freqMap.get(b);
            if(diff == 0)
                return b-a;
            
            return diff;
        });

        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            ans[i] = res[i];

        return ans;        
    }
}
