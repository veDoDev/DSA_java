class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int key;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            key = temp;
            temp = i+2;

            nums[i] = nums[key];
            nums[i + 1] = nums[]; 
        }
        return nums;
    }
}
