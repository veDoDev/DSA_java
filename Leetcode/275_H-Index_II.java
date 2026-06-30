class Solution {
    public int hIndex(int[] citations) 
    {
        // the n-i shpuld be greater equal to citations[i]
        int n = citations.length;
        int high = n - 1;
        int low = 0;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(citations[mid] >= n-mid)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return n-low;  
    }
}
