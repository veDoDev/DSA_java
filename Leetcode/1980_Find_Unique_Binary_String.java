//--------------------------------------------------------------------------------------Approach 1 : My soln; naive-----------------------------------------------------------------------------------------------------------
class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        int n = nums.length;
        int missingInt = n;
        boolean[] intNums = new boolean[1<<n];

        for(int i = 0; i < n; i++)
        {
            int currNum = Integer.parseInt(nums[i], 2);
            intNums[currNum] = true;
        }

        for(int i = 0; i < n; i++)
        {
            if(!intNums[i])
            {
                missingInt = i;
                break;
            }
        }

        StringBuilder mask = new StringBuilder(Integer.toBinaryString(missingInt));

        while(mask.length() < n)
        {
            mask.insert(0, '0');
        }

        return mask.toString();
        
    }
}
//-----------------------------------------------------------------------------------Approach 2 : Cantor's Diagonal Algo------------------------------------------------------------------------------------------------------
class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
            sb.append((nums[i].charAt(i) == '0') ? ('1') : ('0'));

        return sb.toString();       
    }
}
