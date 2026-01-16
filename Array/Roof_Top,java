
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) 
    {
        int n = arr.length;
        
        int maxSteps = 0, currSteps = 0;
        
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] < arr[i+1])
                currSteps++;
            else
                currSteps = 0;
            
            maxSteps = Math.max(maxSteps, currSteps);
        }
        
        return maxSteps;
    }
}
