class Solution {
    static int inversionCount(int arr[]) 
    {
        int n = arr.length;
        
        return (int)mergeSort(arr, 0, n-1);
    }
    
    public static long mergeSort(int[] arr, int low, int high)
    {
        long count = 0;
        if(low >= high)
            return count;
        
        int mid = low + (high - low)/2;
        
        count = mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        
        return count;
        
    }
    
    public static long merge(int[] arr, int low, int mid, int high)
    {
        long count = 0;
        int[] left = new int[mid - low + 1],
              right= new int[high - mid];
             
        for(int i = 0; i < left.length; i++)
            left[i] = arr[low + i];
        for(int i = 0; i < right.length; i++)
            right[i] = arr[mid + i + 1];
            
        int leftPtr = 0,
            rightPtr = 0,
            arrPtr = low;
            
        while(leftPtr < left.length && rightPtr < right.length)
        {
            if(left[leftPtr] > right[rightPtr])
            {
                count += left.length - leftPtr;
                arr[arrPtr++] = right[rightPtr++];
            }
            else
                arr[arrPtr++] = left[leftPtr++];
        }
        
        while(leftPtr < left.length)
            arr[arrPtr++] = left[leftPtr++];
        while(rightPtr < right.length)
            arr[arrPtr++] = right[rightPtr++];
        
        return count;
    }
    
}
