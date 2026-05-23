class Solution {
    public int minimumSwaps(int[] nums) 
    {
        int n = nums.length;
        int zeroPtr = n-1;
        int swaps = 0;

        while(zeroPtr >= 0 && nums[zeroPtr] == 0)
                zeroPtr--;

        for(int i = 0; i < zeroPtr; i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[zeroPtr];
                nums[zeroPtr] = 0;
                swaps++;

                while(zeroPtr >= 0 && nums[zeroPtr] == 0)
                    zeroPtr--;
            }
        }

        return swaps;
    }
}
