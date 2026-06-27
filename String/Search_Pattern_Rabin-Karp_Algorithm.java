class Solution {
    int mulFact = 29;
    long MOD = 2147483647;
    
    public ArrayList<Integer> rabinKarp(String txt, String pat) 
    {
        int m = pat.length();
        int n = txt.length();
        long subFact = 1;
        long bHash = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
        //creating the hash of pat
        for(char x : pat.toCharArray())
            bHash = ((bHash + (x-'a'))*mulFact)%MOD;
        
        long aHash = 0;
        
        //build the window
        for(int i = 0; i < m; i++)
        {
            char x = txt.charAt(i);
            
            aHash = ((aHash + (x-'a'))*mulFact)%MOD;
            subFact = (subFact*mulFact) % MOD;
        }
        
        int tail = 0;
        int head = m-1;
        
        while(head < n)
        {
            if(aHash == bHash && strCmp(pat, txt, tail, head))
                res.add(tail);
                
            if(head+1 >= n)
                break;
                
            head++;
            long subEle = ((txt.charAt(tail)-'a')*subFact)%MOD;
            aHash = (
                        ( (aHash - subEle) 
                           + (txt.charAt(head) - 'a') + MOD
                        ) * mulFact
                    ) % MOD;
            
            tail++;
        }
        
        return res;
    }
    
    private static boolean strCmp(String pat, String txt, int tail, int head)
    {
        int idx = 0;
        
        for(int i = tail; i <= head; i++)
            if(pat.charAt(idx++) != txt.charAt(i))
                return false;
        
        return true;
    }
}
