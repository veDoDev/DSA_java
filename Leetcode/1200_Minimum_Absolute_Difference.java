class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        int n = arr.length;
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n-1; i++)
        {
            int currDiff = arr[i+1] - arr[i];

            if(currDiff < minDiff)
            {
                res.clear();
                minDiff = currDiff;
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
            else if(currDiff == minDiff)
                res.add(Arrays.asList(arr[i], arr[i+1]));
        }

        return res;
        
    }
}
