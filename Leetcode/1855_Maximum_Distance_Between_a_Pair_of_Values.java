//---------------------------------------------------------------------------------------Approach 2 : Two-pointer(optimal)---------------------------------------------------------------------------------------------------
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;
        int maxDist = Integer.MIN_VALUE;

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] <= nums2[j])
            {
                maxDist = Math.max(maxDist, j-i);
                j++;
            }
            else
                i++;
        }

        return (maxDist < 0) ? (0) : (maxDist);        
    }
}

//---------------------------------------------------------------------------------------Approach 1 : Binary Search-----------------------------------------------------------------------------------------------------------
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;
        int maxDist = Integer.MIN_VALUE;
        int lastValidJ = -1;

        for(int i = 0; i < n; i++)
        {
            int curr = nums1[i];
            if(i < m && nums2[i] >= nums1[i])
            {
                lastValidJ = findIdx(curr, nums2, (lastValidJ == -1) ? (i) : (lastValidJ));
                maxDist = Math.max(maxDist, lastValidJ - i);
            }
                
            else
                continue;
        }

        return (maxDist < 0) ? (0) : maxDist;
    }

    public int findIdx(int target, int[] arr, int low)
    {
        int high = arr.length-1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] >= target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return high;
    }
}
