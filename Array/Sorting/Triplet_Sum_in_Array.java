class Solution {
    public boolean hasTripletSum(int arr[], int target) 
    {
        Arrays.sort(arr);
        int n = arr.length;
        
        
        for(int i = 0; i < n-1; i++)
        {
            int left = i + 1;
            int right = n-1;
            int sum = arr[i] + arr[left] + arr[right];
            
            while(left < right)
            {
                if(sum > target)
                    right--;
                else if(sum < target)
                    left++;
                else
                    return true;
                
                sum = arr[i] + arr[left] + arr[right];
            }
        }
        
        return false;
    }
}
