class Solution {
    public int missingNumber(int[] arr) 
    {
        int n = arr.length;;
        
        for(int i = 0; i < n; i++)
        {
            while(arr[i] < n && arr[i] > 0 && arr[i] != i+1 && arr[arr[i] - 1] != arr[i])
            {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            // System.out.println(Arrays.toString(arr));
        }
        int missing = 1;
        
        for(int i = 0; i < n && arr[i] == i+1; i++)
        {
            // System.out.println(arr[i]);
            missing++;
        }
        
        return missing;
    }
}
