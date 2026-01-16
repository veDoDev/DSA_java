class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        
        int tail = 0;
        int currSum = 0;
        
        for(int head = 0; head < n; head++)
        {
            currSum += arr[head];
            
            while(currSum > target && tail < head)
            {
                currSum -= arr[tail];
                tail++;
            }
            
            if(currSum == target)
                return new ArrayList<Integer>(Arrays.asList(tail+1, head+1));
        }
        
        
        return (new ArrayList<Integer>(Arrays.asList(-1)));
        
    }
}
