class Solution {
    public int minPairSum(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;

        int head = n-1, tail = 0;
        int maxSum = Integer.MIN_VALUE;

        while(tail < head)
        {
            maxSum = Math.max(nums[head] + nums[tail], maxSum);
            tail++;
            head--;
        }
        
        // System.out.println(Arrays.toString(nums));
        return maxSum;
        
    }
}
