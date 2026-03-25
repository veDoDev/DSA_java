class Solution {
    public int bitwiseComplement(int n) 
    {
        String num = Integer.toBinaryString(n);
        int len = num.length();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < len; i++)
        {
            char currChar = (num.charAt(i) == '1')?('0'):('1');
            res.append(currChar);
            // System.out.println(currChar);
        }

        // System.out.println(res);

        return Integer.parseInt(res.toString(), 2);
        
    }
}
