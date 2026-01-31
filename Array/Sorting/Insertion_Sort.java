class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) 
    {
        int n = arr.length;
        
        for(int i = 1; i < n; i++)
        {
            int currVal = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > currVal)
            {
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = currVal;
        }
        // code here
        
    }
}
