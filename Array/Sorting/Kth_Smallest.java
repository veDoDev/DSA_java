class Solution {
    public int kthSmallest(int[] arr, int k) 
    {
        PriorityQueue<Integer> ordered = new PriorityQueue<>(k, (a,b) -> (b-a));
        int n = arr.length;
        
        for(int i = 0; i < n; i++)
        {
            ordered.add(arr[i]);
            
            if(ordered.size() > k)
                ordered.poll();
        }
            
        return ordered.poll();
    }
}
