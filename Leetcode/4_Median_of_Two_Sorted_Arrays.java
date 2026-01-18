class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        //assume nums1 to be the shorter one
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int total = n1 + n2; // 1-based length
        int leftSize = (total + 1)/2; //number of elements to be on the left.... STRUCT : (left {Median})(Right)

        int low = 0, high = n1;

        while(low <= high)
        {
            int mid1 = low + (high - low)/2; // number of elements on the left from nums1
            int mid2 = leftSize - mid1;      // number of elements on the left from nums2

            int leftMax1 = (mid1 == 0) ? (Integer.MIN_VALUE) : (nums1[mid1-1]); //-inf
            int rightMin1 = (mid1 == n1) ? (Integer.MAX_VALUE) : (nums1[mid1]); // 2

            int leftMax2 = (mid2 == 0) ? (Integer.MIN_VALUE) : (nums2[mid2-1]); // 3
            int rightMin2 = (mid2 == n2) ? (Integer.MAX_VALUE) : (nums2[mid2]); //inf

            if(leftMax1 <= rightMin2 && leftMax2 <= rightMin1)
            {
                if(total%2 == 1)
                    return Math.max(leftMax1, leftMax2);
                return (Math.max(leftMax1, leftMax2) + Math.min(rightMin1, rightMin2))/2.0;
            }
            else if(leftMax1 > rightMin2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0;


        
    }
}
