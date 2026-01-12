//==============================================================================================__Approach 1__=========================================================================================================
class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int leftL = 0, leftU = 0;
        int rightL = n-1, rightU = n-1;
        int[] res = {-1, -1};

        while(leftL <= rightL || leftU <= rightU)
        {
            if(leftL <= rightL)
            {
                int midL = leftL + (rightL - leftL) / 2;

                if(nums[midL] == target)
                {
                    rightL = midL - 1;
                    res[0] = midL;
                }
                else if(nums[midL] > target)
                    rightL = midL - 1;
                else
                    leftL = midL + 1;
            }

            if(leftU <= rightU)
            {
                int midU = leftU + (rightU - leftU)/2;

                if(nums[midU] == target)
                {
                    leftU = midU+1;
                    res[1] = midU;
                }
                else if(nums[midU] > target)
                    rightU = midU - 1;
                else
                    leftU = midU + 1;
            }

            // System.out.println(Arrays.toString(res));
        }
        
        return res;
    }

  //==============================================================================================__Approach 2__=========================================================================================================
class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int res0 = -1, res1 = -1;

        //upper bound
        while(left <= right)
        {
            int mid = (right + left) / 2;

            if(nums[mid] == target)
            {
                res1 = Math.max(res1, mid);
                left = mid + 1;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if(res1 == -1)
            return new int[] {-1, -1};
        
        //lowerBound
        left = 0;
        right = n-1;
        res0 = Integer.MAX_VALUE;

        while(left <= right)
        {
            int mid = (right + left)/2;

            if(nums[mid] == target)
            {
                right = mid - 1;
                res0 = Math.min(res0, mid);
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return new int[] {res0, res1};
    }
}




  
}
