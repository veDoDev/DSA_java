class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) 
    {
        int n = arr.length;
        
        for(int i = 0; i < n; i++)
        {
            int currMin = arr[i];
            for(int j = i; j < n; j++)
            {
                if(arr[j] < arr[i])
                {
                    arr[j] = arr[j] + arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
                
            }
        }
        // code here
        
    }
}
