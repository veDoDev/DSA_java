class Solution {
    static ArrayList<Character> primes = new ArrayList<>(Arrays.asList('2', '3', '5','7'));
    
    public static int primeDigits(int n) 
    {
        StringBuilder res = new StringBuilder();
        int idx = 0;
        while(n > 0)
        {
            n--;
            idx = n%4;
            res.append(primes.get(idx));
            n /= 4;
        }
        
        int len = res.length();
        int ans = 0;
        for(int i = len-1; i >= 0; i--)
            ans = (ans*10) + (res.charAt(i)-'0');
        
        return ans;
        
    }
}
