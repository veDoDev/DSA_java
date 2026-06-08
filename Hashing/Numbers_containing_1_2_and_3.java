class Solution {
    HashSet<Integer> dig = new HashSet<>();
    
    public ArrayList<Integer> filterByDigits(int[] arr) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        dig.add(1);
        dig.add(2);
        dig.add(3);
        for(int x : arr)
            if(contBigThree(x))
                res.add(x);
                
        return res;
    }   
    
    private boolean contBigThree(int x)
    {
        boolean flag = false;
        while(x > 0)
        {
            int mod = x%10;
            if(dig.contains(mod))
                flag = true;
            else
                return false;
                
            x /= 10;
        }
        
        return flag;
    }
}
