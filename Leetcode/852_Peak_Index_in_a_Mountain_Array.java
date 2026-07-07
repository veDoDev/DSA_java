//-------------------------------------------------------------------------------------Approach 2 : Recursive -Binary Search----------------------------------------------------------------------------------------------------
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return findPeak(arr, 0, arr.length - 1);
    }

    private int findPeak(int[] arr, int low, int high) 
    {
        if (low == high) return low;

        int mid = low + (high - low) / 2;

        if (arr[mid] < arr[mid + 1]) 
            return findPeak(arr, mid + 1, high);
        else
            return findPeak(arr, low, mid);
    }
}
//-------------------------------------------------------------------------------------Approach 1 : Binary Search---------------------------------------------------------------------------------------------------------------
class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int low = 1;
        int high = arr.length - 2;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid-1] < arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }
}
