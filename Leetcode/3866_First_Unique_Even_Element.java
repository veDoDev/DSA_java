class Solution {
    public int firstUniqueEven(int[] arr) 
    {
        int n = arr.length;
        int firstIdx = -1;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i]%2 == 0)
            {
                if(!res.contains(arr[i]))
                {
                    res.add(arr[i]);
                }
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);
            }               
        }

        for(int i = 0; i < res.size(); i++)
        {
            int curr = res.get(i);
            if(freqMap.get(curr) == 1)
                    return curr;
        }

        return -1;
    }
}
