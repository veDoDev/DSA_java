//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] sieveOfErat = new boolean[N+1];
        sieveOfErat = sieveOfErat(N);
        
        for(int i = 0; i<=N; i++)
        {
            if(sieveOfErat[i])  primes.add(i);
        }
        
        return primes;
    }
    
    private static boolean[] sieveOfErat(int limit)
     {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);// Assuming all of them to be prime
        isPrime[0] = isPrime[1] = false;  

        for (int i = 2; i * i <= limit; i++)
        {
            if (isPrime[i])
            {
                for (int j = i * i; j <= limit; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
