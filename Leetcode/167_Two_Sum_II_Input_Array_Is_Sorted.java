class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] res = new int[2];
        int n = numbers.length;

        int bckPtr = n - 1, ftrPtr = 0;
        int currSum;

        while(ftrPtr < bckPtr)
        {
            currSum = numbers[ftrPtr] + numbers[bckPtr];
            if(currSum == target)
                break;
            
            else if(currSum < target)
                ftrPtr++;
            else
                bckPtr--;
        }
        // System.out.println(ftrPtr + " " + bckPtr);

        res[0] = ftrPtr+1;
        res[1] = bckPtr+1;

        return res;
    }
}
