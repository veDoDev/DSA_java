class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int n = nums.length;
        int resultant[] = new int[100];
        int res[] = new int[n];
        int trckr = 0;

        for(int i = 0; i < n; i++)
            resultant[nums[i]] = 1;

        for(int i = 0; i < 100; i++)
            resultant[i] += (i > 0) ? (resultant[i-1]) : -1;


        for(int i = 1; i < n; i++)
            res[i] = (nums[i] - 1 >= 0) ? (resultant[nums[i]-1]) : (resultant[0]);

        return res;
    }
}
