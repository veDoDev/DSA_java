class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n = nums.length;
        int lim = n/3;

        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);

            if(freqMap.get(nums[i]) == lim + 1)
                res.add(nums[i]);
        }

        return res;
    }
}
