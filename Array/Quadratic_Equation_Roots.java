class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) 
    {
        long D = (long) b*b - 4L*a*c;
        
        if(D < 0)
            return new ArrayList<Integer>(Arrays.asList(-1));
        
        double sqrtD = Math.sqrt(D);
            
        int x = (int)Math.floor((-b + sqrtD)/(2.0*a));
        int y = (int)Math.floor((-b - sqrtD)/(2.0*a));
        
        
        if(x < y)
            return new ArrayList<Integer>(Arrays.asList(y, x));
            
        return new ArrayList<Integer>(Arrays.asList(x, y));
    }
}
