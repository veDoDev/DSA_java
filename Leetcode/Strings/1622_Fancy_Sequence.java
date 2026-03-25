class Fancy 
{
    private List<Long> arr = new ArrayList<>();
    private final long MOD = 1_000_000_007L;
    private long mulFactor = 1;
    private long addFactor = 0;

    public Fancy() {
        
    }
    
    public void append(int val) 
    {
        // mulfact and addfact must be 1 and 0 for this element initially..
        long element = ((val - addFactor % MOD + MOD) * modPow(mulFactor, MOD - 2)) % MOD;
        arr.add((element)%MOD);
        
    }
    
    public void addAll(int inc) 
    {
        addFactor = (addFactor + inc) % MOD;
    }
    
    public void multAll(int m) 
    {
        mulFactor = (mulFactor * m) % MOD;
        addFactor = (addFactor * m) % MOD; 
    }
    
    public int getIndex(int idx) 
    {
        if (idx >= arr.size()) return -1;  // missing!
        return (int) ((arr.get(idx) * mulFactor + addFactor) % MOD);
    }


    private long modPow(long base, long exp)
    {
        long res = 1L;
        base %= MOD;

        while(exp > 0)
        {
            if((exp & 1) == 1)
                res = res * base % MOD;
            
            base = base * base % MOD;
            exp >>= 1;;
        }

        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
