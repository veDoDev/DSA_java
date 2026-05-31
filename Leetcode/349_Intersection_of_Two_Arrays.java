//-------------------------------------------------------------------------------------Approach 2 - constraint based optimisation-------------------------------------------------------------------------------------------
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        boolean[] map = new boolean[1001];

        for(int x : nums1)
            map[x] = true;

        ArrayList<Integer> res = new ArrayList<>();
        for(int x : nums2)
        {
            if(map[x])
            {
                map[x] = false;
                res.add(x);
            }
        }

        int n = res.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
            ans[i] = res.get(i);

        return ans;
    }
}
//-------------------------------------------------------------------------------------Approach 1 - HashSet-----------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> set = new HashSet<>();

        for(int x : nums1)
            set.add(x);

        List<Integer> resL = new ArrayList<>();
        for(int x : nums2)
        {
            if(set.contains(x))
            {
                set.remove(x);
                resL.add(x);
            }
        }
                
        int n = resL.size();
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = resL.get(i);
        
        return res;
    }
}
