//-------------------------------------------------------------------------------------------Appoach 1------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n = nums.length;

        List<Integer> greaterElements = new ArrayList<>();
        List<Integer> smallerElements = new ArrayList<>();

        for (int num : nums)
        {
            if (num > pivot)
                greaterElements.add(num);
            else if (num < pivot)
                smallerElements.add(num);
        }

        int index = 0;

        for (int num : smallerElements)
            nums[index++] = num;

        int greaterCount = greaterElements.size();

        while (n - index > greaterCount)
            nums[index++] = pivot;

        for (int num : greaterElements)
            nums[index++] = num;

        return nums;
    }
}
//-------------------------------------------------------------------------------------------Appoach 2------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int n = nums.length;

        int greaterCount = 0;
        int smallerCount = 0;

        int[] greaterElements = new int[n];
        int[] smallerElements = new int[n];

        for (int num : nums)
        {
            if (num > pivot)
                greaterElements[greaterCount++] = num;
            else if (num < pivot)
                smallerElements[smallerCount++] = num;
        }

        int pivotStart = smallerCount;
        int pivotEnd = n - greaterCount;

        int greaterWriteIndex = pivotEnd;
        int smallerWriteIndex = 0;
        int pivotWriteIndex = pivotStart;

        int greaterReadIndex = 0;
        int smallerReadIndex = 0;

        while (greaterWriteIndex < n ||
               smallerWriteIndex < smallerCount ||
               pivotWriteIndex < pivotEnd)
        {
            if (greaterWriteIndex < n)
                nums[greaterWriteIndex++] =
                    greaterElements[greaterReadIndex++];

            if (smallerWriteIndex < smallerCount)
                nums[smallerWriteIndex++] =
                    smallerElements[smallerReadIndex++];

            if (pivotWriteIndex < pivotEnd)
                nums[pivotWriteIndex++] = pivot;
        }

        return nums;
    }
}
//-------------------------------------------------------------------------------------------Appoach 3------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) 
        {
            if (nums[i] < pivot) 
            {
                result[left] = nums[i];
                left++;
            }
            
            if (nums[j] > pivot) 
            {
                result[right] = nums[j];
                right--;
            }
        }
        
        while (left <= right) 
        {
            result[left] = pivot;
            left++;
        }
        
        return result;
    }
}
