class Solution {
    
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    
    public void reverse(int index_1, int index_2, int[] arr) {
        while (index_1 < index_2) {
            swap(arr, index_1, index_2);
            index_1++;
            index_2--;
        }
    }
    public void nextPermutation(int[] nums) 
    {
        int index1 = -1, index2 = -1;
        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                index1 = i;
                break;
            }
        }
        
        if(index1 != -1)
        {
        for(int i = nums.length-1; i > index1; i--)
        {
            if(nums[i] > nums[index1])   
            {
                index2 = i;
                break;
            }
        }

        swap(nums,index1,index2);
        }
        reverse(index1+1,nums.length-1,nums);
    }
}
