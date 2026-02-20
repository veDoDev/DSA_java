class Solution {
    public void quickSort(int[] arr, int low, int high) 
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
        
    }

    private int partition(int[] arr, int low, int high) 
    {
        int pivot = high;
        int j = low-1;
        
        for(int i = low; i < high; i++)
        {
            if(arr[i] <= arr[pivot])
            {
                j++;
                swap(i, j, arr);
            }
        }
        swap(j+1, pivot, arr);
        
        return j+1;
    }
    
    public void swap(int i, int j, int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
