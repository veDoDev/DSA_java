class Solution {
    int closer(int[] arr, int x) 
    {
        int n = arr.length;
        
        int high = n-1;
        int low = low = 0;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(arr[mid] == x)
                return mid;
            else if(mid+1 < n && arr[mid+1] == x)
                return mid+1;
            else if(mid - 1 >= 0 && arr[mid-1] == x)
                return mid-1;
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }
}
