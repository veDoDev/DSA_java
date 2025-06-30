//------------------------------------------------------------------ 2. First Soln(Naive) ----------------------------------------------------------------------------------------------------------
// class Solution {
//     public int[] productExceptSelf(int[] nums) 
//     {
//         int n = nums.length;
//         int[] fwd = new int[n];
//         int[] bwd = new int[n];
//         int[] soln = new int[n];
//         fwd[0] = nums[0];
//         bwd[n-1] = nums[n-1];

//         for(int i = 1; i < n; i++)
//         {
//             int bckPtr = n-i-1;
//             fwd[i] = fwd[i-1]*nums[i];
//             bwd[bckPtr] = bwd[bckPtr+1]*nums[bckPtr];
//         }

//         soln[0] = bwd[1];
//         soln[n-1] = fwd[n-2];
//         for(int i = 1; i < n-1; i++)
//         {
//             soln[i] = fwd[i-1]*bwd[i+1];
//         }

//         // System.out.println(Arrays.toString(fwd) + "\n" + Arrays.toString(bwd));
//         return soln;
//     }
// }
//------------------TC : θ(2n) --------------|-----------------SC : θ(3n)--------------------|------------Beats : 6.82% in time--------------|-------------Beats : 24.24% in memory-----------------

//---------------------------------------------------------------------------------------------- 2. Optimized --------------------------------------------------------------------------------------

class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int postfix = 1;
        int[] soln = new int[n];
        //forward Multip
        soln[0] = 1;
        for(int i = 1; i < n; i++)
        {
            soln[i] = soln[i-1]*nums[i-1];
        }
        //backward multiplication
        for(int i = n-2; i >= 0; i--)
        {
            postfix *= nums[i+1];
            soln[i] = soln[i]*postfix;
        }
        return soln;
    }
}
//------------------TC : θ(2n) --------------|-----------------SC : θ(1)--------------------|------------Beats : 88.75% in time--------------|-------------Beats : 75.22% in memory-----------------
