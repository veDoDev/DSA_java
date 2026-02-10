//--------------------------------------------------------------------------------------Approach 1 : QS standard Partition---------------------------------------------------------------------------------------------------
class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) 
    {
        int n = arr.length;
        int pivot = partition(arr, a, 0, n-1);
        pivot = partition(arr, b, pivot, n-1);
    }
    
    public int partition(int arr[], int pivot, int start, int end)
    {
        int lTracker = start;
        for(int i = start; i <= end; i++)
        {
            if(arr[i] < pivot)
                swap(lTracker++, i, arr);
        }
        return lTracker;
    }
    
    public void swap(int x, int y, int[] arr)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
//--------------------------------------------------------------------------------------Approach 2 : Dutch National Flag-----------------------------------------------------------------------------------------------------
class Solution {
  // Function to partition the array around the range such
  // that array is divided into three parts.
  public void threeWayPartition(int arr[], int a, int b) 
  {
    int n = arr.length;
    int aPtr = 0, bPtr = n-1, midPtr = 0;
           
    while(midPtr <= bPtr)
    {
      if(arr[midPtr] < a)
        swap(aPtr++, midPtr++, arr);
      else if(arr[midPtr] > b)
        swap(bPtr--, midPtr, arr);
      else
        midPtr++;
      }
  }
        
  public void swap(int x, int y, int[] arr)
  {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}
