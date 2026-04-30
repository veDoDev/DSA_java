class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n = nums.length;
        boolean[] found = new boolean[n+1];
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++)
            found[nums[i]] = true;
        
        for(int i = 1; i <= n; i++)
        {
            if(!found[i])
                res.add(i);
        }

        return res;
    }
}
