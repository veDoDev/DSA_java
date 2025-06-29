class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> maj = new TreeSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            if(map.get(nums[i]) != null )
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);

            if(map.get(nums[i]) > n/3)
                maj.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(maj);
        return list;        
    }
}
