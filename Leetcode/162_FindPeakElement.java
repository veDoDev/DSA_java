class Solution {
    public int findPeakElement(int[] nums) 
    {
        int n = nums.length;
        return peakEle(nums, 0, n - 1); 
    }

    //    D&C
    int peakEle(int[] arr, int lowerLim, int upperLim) {
        if (lowerLim == upperLim) return lowerLim; 

        int ptr = lowerLim + (upperLim - lowerLim) / 2;

        if (arr[ptr] > arr[ptr + 1])    return peakEle(arr, lowerLim, ptr);
        return peakEle(arr, ptr + 1, upperLim);
    }
}
