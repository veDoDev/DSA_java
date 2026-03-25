class Solution {
    public int[] sumZero(int n) 
    {
        int[] res = new int[n];
        int idxPtr = 0;

        for(int i = 1; i <= n/2; i++)
        {
            res[idxPtr++] = i;
            res[idxPtr++] = -1*i;
        }

        if(n%2 == 1)
            res[n-1] = 0;
        
        return res;
        
    }
}


// class Solution {
//     public int[] sumZero(int n) 
//     {
//         int[] res = new int[n];

//         // System.out.println("Common sequence");
//         for(int i = 0; i < n/2; i++)
//             res[i] = i+1;
//         // System.out.println(Arrays.toString(res));
//         if(n%2 == 0)
//         {
//             // System.out.println("Even sequence");
//             for(int i = n/2; i < n; i++)
//                 res[i] = (n - i)*-1;

//             return res;
//         }
        
//         // System.out.println("Odd sequence");
//         for(int i = n/2; i < n-1; i++)
//             res[i] = -1*(n-i-1);
//         // System.out.println(Arrays.toString(res));

//         res[n-1] = 0;
//         return res;
        
//     }
// }
