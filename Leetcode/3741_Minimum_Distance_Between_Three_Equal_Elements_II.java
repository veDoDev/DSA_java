class Solution {
    public int minimumDistance(int[] nums) 
    {
        int n = nums.length;
        int minDist = Integer.MAX_VALUE;

        // 1. Creating hashtable
        HashMap<Integer, List<Integer>> freqIdx = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            if(!freqIdx.containsKey(nums[i]))
            {
                List<Integer> curr = new ArrayList<>();
                curr.add(i);
                freqIdx.put(nums[i], curr);
            }
            else
                freqIdx.get(nums[i]).add(i);            
        }

        // 2. Traversing the HashTable
        for(Map.Entry<Integer, List<Integer>> ent : freqIdx.entrySet())
        {
            List<Integer> currValSet = ent.getValue();
            int currLen = currValSet.size();
            
            if(currLen == 3)
                minDist = Math.min(minDist, 2*(currValSet.get(2) - currValSet.get(0)));
            else if(currLen > 3)
                minDist = Math.min(minDist, 2*bestTrio(currValSet)); 
        }
        

        return (minDist == Integer.MAX_VALUE) ? (-1) : (minDist);
    }

    private int bestTrio(List<Integer> arr)
    {
        int n = arr.size();
        int minSpan = Integer.MAX_VALUE;

        for(int i = 0; i+2 < n; i++)
            minSpan = Math.min(minSpan, arr.get(i+2) - arr.get(i)); 
        
        return minSpan;
    }
}
