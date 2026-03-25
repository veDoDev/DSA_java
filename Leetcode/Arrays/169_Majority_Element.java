class Solution {
    public int majorityElement(int[] nums) 
    {
       int n = nums.length;

       int count = 0, candidate = -1;
       
       for(int num : nums)
       {
            if(count == 0)
            {
                candidate = num;
                count = 1;
            }
            else if(candidate == num)
                count++;
            else count--;
       }

       count = 0;

       for(int num : nums)
       {
            if(num == candidate)
                count++;
       }
        
        return (count > n/2)?(candidate):(-1);
    }
}
