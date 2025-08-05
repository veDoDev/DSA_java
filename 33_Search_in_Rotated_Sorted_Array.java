class Solution 
{
    public int search(int[] nums, int target) 
    {
        //1. use binary search to find the pivot
        //2. use binary search and format the real mid considering the pivot

        int pivot = findPivot(nums);
        int n = nums.length;
        int low = 0, high = n-1;
        int virtualMid = 0, mid = 0;

        while(low <= high)
        {
            virtualMid = (low + high)/2;
            mid = (virtualMid + pivot) % n;

            if(nums[mid] == target)  return mid;

            if(nums[mid] > target)
                high = virtualMid-1;
            else 
                low = virtualMid + 1;
            
        }

        return -1;
           
    }

    private int findPivot(int[] arr)
    {
        int high = arr.length-1, low = 0;
        int mid = 0;

        while (low < high)
        {
            mid = (high + low)/2;

            if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
} 
