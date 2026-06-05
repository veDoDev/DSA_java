class Solution {
    static int subArraySum(int arr[], int target) 
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int totSum = 0;
        int count = 0;
        
        for(int x : arr)
        {
            totSum += x;r
            if(map.containsKey(totSum - target))
                count+=map.get(totSum-target);
                
            map.put(totSum, map.getOrDefault(totSum, 0)+1);
        }
        
        return count;
    }
}
