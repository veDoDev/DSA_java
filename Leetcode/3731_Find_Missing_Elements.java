class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        int[] map = new int[101];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums)
        {
            min = Math.min(min, x);
            max = Math.max(max, x);
            map[x]++;
        }

        List<Integer> res = new ArrayList<>();

        for(int i = min; i <= max; i++)
            if(map[i] == 0)
                res.add(i);

        return res;
    }
}
