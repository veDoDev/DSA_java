class Solution {
    public int minimumPairRemoval(int[] nums) 
    {
        int n = nums.length;
        int count = 0;

        boolean isSorted = false;

        while(!isSorted)
        {
            isSorted = true;
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            for(int i = 0; i < n-1; i++)
            {
                if(nums[i] > nums[i+1])
                    isSorted = false;

                if(nums[i] + nums[i+1] < minSum)
                {
                    minSum = nums[i] + nums[i+1];
                    idx = i;
                }
            }

            if(isSorted)
                break;

            n--;
            nums[idx] = minSum;

            for(int j = idx + 1; j < n; j++)
                nums[j] = nums[j+1];

            count++;           
        }

        return count;
    }
}
