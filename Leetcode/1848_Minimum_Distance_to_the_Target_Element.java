class Solution {
    public int getMinDistance(int[] nums, int target, int start) 
    {
        int n = nums.length;

        int leftPtr = start;
        int rightPtr = start;

        while(leftPtr >= 0 || rightPtr < n)
        {
            if(leftPtr >= 0 && nums[leftPtr] == target)
                return Math.abs(start - leftPtr);
            
            if(rightPtr < n && nums[rightPtr] == target)
                return Math.abs(start - rightPtr);

            leftPtr--;
            rightPtr++;
        }

        return 0;
    }
}x`
