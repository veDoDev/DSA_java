class Solution {
    public List<Integer> findValidElements(int[] nums) 
    {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        boolean[] pre = new boolean[n];
        boolean[] suf = new boolean[n];
        int leftG = nums[0],
            rightG = nums[n-1];

        pre[0] = true;
        suf[n-1] = true;

        for(int i = 1; i < n; i++)
        {
            int comp = n-1-i;
            if(nums[i] > leftG)
            {
                leftG = nums[i];
                pre[i] = true;
            }
            else
                pre[i] = false;
            
            if(nums[comp] > rightG)
            {
                rightG = nums[comp];
                suf[comp] = true;
            }
            else
                suf[comp] = false;
        }

        for(int i = 0; i < n; i++)
        {
            if(pre[i] | suf[i])
                res.add(nums[i]);
        }

        return res;        
    }
}
