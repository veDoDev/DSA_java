class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int n = nums.length;
        int windowSum = 0;
        int tail = 0;
        int head = k;
        int max = 0;

        //window construction
        for(int i = 0; i < k; i++)
            windowSum += nums[i];

        max = windowSum;

        while(head < n)
        {
            windowSum += nums[head] - nums[tail];
            if(windowSum > max)
                max = windowSum;
            
            head++;
            tail++;
        }

        return (double)max/k;
        
    }
}
