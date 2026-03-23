class Solution {
    public int countPairs(int x[], int y[]) 
    {
        int nx = x.length;
        int ny = y.length;
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        int count = 0;
        
        int[] freq = new int[5];
        for(int i = 0; i < ny; i++)
        {
            if(y[i] < 5)
                freq[y[i]]++;
        }
        
        for(int i = 0; i < nx; i++)
        {
            if(x[i] == 0)
                continue;
            else if(x[i] == 1)
                count += freq[0];
            else if(x[i] == 2)
            {
                count += binSearch(y, 2);
                count -= freq[3] + freq[4] - freq[0] - freq[1];
            }
            else if(x[i] == 3)
            {
                count += binSearch(y, 3);
                count += freq[2] + freq[0] + freq[1];
            }
            else
            {
                count += binSearch(y, x[i]);
                count += freq[0] + freq[1];
            }
        }
        
        return count;
    }
    
    public int binSearch(int[] arr, int x)
    {
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return arr.length - low;
    }
}
