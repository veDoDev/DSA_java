//--------------------------------------------------------------------------------- Approch 1 : sorting ---------------------------------------------------------------------------------------------------------------------
class Solution {
    public int maximumProduct(int[] arr) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        
        return Math.max(arr[n-1]*arr[n-2]*arr[n-3], arr[n-1]*arr[0]*arr[1]);
        
    }
}
//------------------------------------------------------------------------------- Approach 2 : track on the fly ------------------------------------------------------------------------------------------------------------
class Solution {
    public int maximumProduct(int[] nums) 
    {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int x : nums)
        {
            if(max1 <= x)
            {
                max3 = max2;
                max2 = max1;
                max1 = x;
            }
            else if(max2 <= x)
            {
                max3 = max2;
                max2 = x;
            }
            else if(max3 < x)
                max3 = x;


            if(min1 >= x)
            {
                min2 = min1;
                min1 = x;
            }
            else if(min2 > x)
                min2 = x;
        }

        return Math.max(min1*min2*max1, max1*max2*max3);
    }
}
