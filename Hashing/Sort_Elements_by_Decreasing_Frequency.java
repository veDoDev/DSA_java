class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency
        for (int x : arr) 
            map.put(x, map.getOrDefault(x, 0) + 1);
        
        // Convert array to Integer[] for sorting
        ArrayList<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++)
            nums.add(arr[i]);

        Collections.sort(nums, (a, b) -> {
            int freqCompare = map.get(b) - map.get(a);
            
            if (freqCompare == 0)
                return a - b;
                
            return freqCompare;
        });
        
        return nums;
    }
}
