class Solution 
{
    public static int intersectSize(int a[], int b[]) 
    {
        Set<Integer> set = new HashSet<>();
        
        for(int x : a)
            set.add(x);
        
        int count = 0;
        for(int x : b)
            if(set.contains(x))
                count++;
                
        return count;
    }
}
