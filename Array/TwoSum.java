class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int head = 0,tail = 1;
        int[] subarr = new int[2];
        subarr[0] = head;
        subarr[1] = tail;
        int sum = nums[head] + nums[tail];

        for(int i = 0; ((head<nums.length-1)&&(head<tail)); i++)
        {
            if(sum == target)   break;
            if(tail < nums.length-1)
            {
                tail++;
            }
            else
            {
                head++;
                tail = head+1;
            }
            sum = nums[head] + nums[tail];
        }
        subarr[0] = head;
        subarr[1] = tail;
        return subarr;
    }
}



//**************************************************************************************************Better solution:*****************************************************************************************************
//                                                                                    
// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (map.get(nums[i]) != null) {
//                 int[] ans = {map.get(nums[i]), i};
//                 return ans;
//             }
//             map.put(target - nums[i], i);
//         }
//         return null;
//     }
// }
