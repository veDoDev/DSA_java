class Solution {
    public int countOnes(int[] arr) 
    {
        int n = arr.length;
        int right = n-1;
        int left = 0;
        int idx = -1;
        
        while(right >= left)
        {
            int mid = (right + left)/2;
            
            if(arr[mid] == 1)
            {
                left = mid+1;
                idx = Math.max(idx, mid);
            }
            else
                right = mid-1;
                
            // System.out.println(idx + " " + mid);
        }
        
        return idx+1;
    }
}
