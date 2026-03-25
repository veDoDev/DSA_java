class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        
        int[] res = new int[2*nums.length];
        int resPtr = 0;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                res[resPtr] = nums[j];
                resPtr++;
            }
        }

        return res;
        
    }
}
