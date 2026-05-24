class Solution {
    public int[] limitOccurrences(int[] nums, int k) 
    {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int freq = 0;
            // res.add(nums[i]);
            int curr = nums[i];
            while(i < n && curr == nums[i])
            {
                if(i < n && freq < k)
                {
                    freq++;
                    res.add(nums[i]);
                }
                i++;
            }
            i--;
        }

        int m = res.size();
        int[] ans = new int[m];
        for(int i = 0; i < m; i++)
        {
            ans[i] = res.get(i);
        }

        return ans;
        
    }
}
