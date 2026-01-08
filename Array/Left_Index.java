class Solution {
    public int leftIndex(int n, int[] arr, int x) 
    {
        int left = 0, right = n-1;
        int mid = (left + right)/2;
        
        int minIdx = Integer.MAX_VALUE;
        boolean found = false;
        
        while(left <= right)
        {
            if(arr[mid] > x)
                right = mid-1;
            
            else if(arr[mid] < x)
                left = mid+1;
            else
            {
                minIdx = Math.min(minIdx, mid);
                found = true;
                right = mid-1;
            }
            mid = (right + left)/2;
        }
        
        return (found)?(minIdx):(-1);
        
    }
}
