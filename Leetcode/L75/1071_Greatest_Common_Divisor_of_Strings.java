class Solution {
    public String gcdOfStrings(String str1, String str2)
    {
        // If their concatenations in both orders are not equal, return ""
        if (!(str1 + str2).equals(str2 + str1)) 
            return "";
        

        // Otherwise, return the substring from 0 to GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) 
    {
        // Euclidean algorithm
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
