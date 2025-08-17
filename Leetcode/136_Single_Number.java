class Solution {
    public int singleNumber(int[] nums) 
    {
        int unOccurredEle = nums[0];

        for(int i = 1; i < nums.length; i++)
            unOccurredEle = unOccurredEle ^ nums[i];

        return unOccurredEle;
        
    }
}
