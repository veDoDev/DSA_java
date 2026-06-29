class Solution {
    public static boolean isRotated(String s1, String s2) 
    {
        int n = s1.length();
        int m = s2.length();
        
        if(n != m)
            return false;
            
        int p1 = 2;
        int p2 = n-2;
        StringBuilder sb1 = new StringBuilder(),
                      sb2 = new StringBuilder();
            
        for(int i = 0; i < n; i++)
        {
            sb1.append(s1.charAt(p1%n));
            sb2.append(s1.charAt(p2%n));
            
            p1++;
            p2++;
        }
        
        return (s2.equals(sb2.toString()) || s2.equals(sb1.toString()));
    }
}
