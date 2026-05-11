//-------------------------------------------------------------------------------------------Approach 1---------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] separateDigits(int[] nums) 
    {
        int dig;
        String currNum = new String();
        List<Integer> res = new ArrayList<>();

        for(int x : nums)
        {
            currNum = ""+x;

            for(char y : currNum.toCharArray())
                res.add(y - 48);            
        }

        int n = res.size();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
            ans[i] = res.get(i);

        return ans;
    }
}


//-------------------------------------------------------------------------------------Approach 2------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] separateDigits(int[] nums) 
    {
        int dig;
        String currNum = new String();
        List<Integer> res = new ArrayList<>();

        for(int x : nums)
        {
            currNum = ""+x;

            for(int i = 0; i < currNum.length(); i++)
                res.add(currNum.charAt(i) - 48);            
        }

        int n = res.size();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++)
            ans[i] = res.get(i);

        return ans;
    }
}

//--------------------------------------------------------------------------------------- Approach 3 ----------------------------------------------------------------------------------------------- 
class Solution {
    public int[] separateDigits(int[] nums) 
    {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;

        for(int i = n-1; i >= 0; i--)
        {
            int curr = nums[i];
            while(curr > 0)
            {
                int dig = curr%10;
                curr /= 10;
                s.push(dig);
            }
        }

        int ans[] = new int[s.size()];
        int idx = 0;

        while(!s.empty())
            ans[idx++] = s.pop();

        return ans;        
    }
}

//--------------------------------------------------------------------------------------- Approach 4 ----------------------------------------------------------------------------------------

class Solution {
    public int[] separateDigits(int[] nums) 
    {
        int size = 0;
        for(int x : nums)
        {
            while(x  > 0)
            {
                x /= 10;
                size++;
            }
        }
        int[] ans = new int[size];
        int ptr = size-1;
        int currNum, digit;

        for(int i = nums.length-1; i >= 0; i--)
        {
            currNum = nums[i];

            while(currNum > 0)
            {
                digit = currNum%10;
                currNum /= 10;
                ans[ptr] = digit;
                ptr--;
            }
        }

        return ans;
    }
}
