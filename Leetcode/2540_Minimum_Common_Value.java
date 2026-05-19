//-------------------------------------------------------------------------------------approach 1--------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i1 = 0;

        while(i1 < n1 && nums2[0] > nums1[i1])
            i1++;
        
        if(i1 == n1)    return -1;

        for(int i = i1; i < n1; i++)
        {
            int low = 0;
            int high = n2-1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(nums2[mid] == nums1[i])
                    return nums2[mid];
                else if(nums2[mid] < nums1[i])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return -1;      
    }
}
//-------------------------------------------------------------------------------------approach 2--------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 < n2)
            return returnMin(nums1, nums2, n1, n2);
        
        return returnMin(nums2, nums1, n2, n1);
    }

    private int returnMin(int[] nums1, int[] nums2, int n1, int n2)
    {
        int i1 = 0;

        while(i1 < n1 && nums2[0] > nums1[i1])
            i1++;
        
        if(i1 == n1)    return -1;

        for(int i = i1; i < n1; i++)
        {
            int low = 0;
            int high = n2-1;

            while(low <= high)
            {
                int mid = low + (high - low)/2;

                if(nums2[mid] == nums1[i])
                    return nums2[mid];
                else if(nums2[mid] < nums1[i])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return -1;
    }
}
//-------------------------------------------------------------------------------------approach 3--------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int i1 = 0;
        int i2 = 0;

        while(i1 < n1 && i2 < n2)
        {
            if(nums1[i1] == nums2[i2])
                return nums1[i1];
            
            else if(nums1[i1] < nums2[i2])
                i1++;
            else
                i2++;
        }

        return -1;
    }
}
