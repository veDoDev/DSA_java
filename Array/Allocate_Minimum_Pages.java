class Solution {
    public int findPages(int[] arr, int k) 
    {
        int n = arr.length;
        if(k > n)   return -1;
        
        int maxBooks = 0;
        int minBooks = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++)
        {
            maxBooks += arr[i];
            minBooks = Math.max(minBooks, arr[i]);
        }
        
        int low = minBooks;
        int high = maxBooks;
            
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            int stuCnt = studentCount(arr, mid, n);
            
            if(stuCnt > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    
    public int studentCount(int[] arr, int pages, int n)
    {
        int students = 1;
        int currPages = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(currPages + arr[i] <= pages)
                currPages += arr[i];
            else
            {
                currPages = arr[i];
                students++;
            }
        }
        
        return students;
    }
}
