//-----------------------------------------------------------------------------------------------Approach 1-------------------------------------------------------------------------------------------------------------------
class Solution {
    public String addBinary(String a, String b) 
    {
        int aPtr = a.length()-1;
        int bPtr = b.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0, bitAdd = 0;


        while(aPtr >= 0 || bPtr >= 0)
        {
            int aChr = (aPtr < 0 ? '0' : a.charAt(aPtr--)) - '0';
            int bChr = (bPtr < 0 ? '0' : b.charAt(bPtr--)) - '0';

            bitAdd = aChr ^ bChr ^ carry;
            carry = (aChr+bChr+carry > 1) ? (1) : (0);
            res.insert(0, bitAdd);
            System.out.println(aChr + " + " + bChr + " = " + carry + "" + bitAdd);
        }
        if(carry == 1)
            res.insert(0, carry);

        return res.toString();
    }
}
//-----------------------------------------------------------------------------------------------Approach 2-------------------------------------------------------------------------------------------------------------------
class Solution {
    public String addBinary(String a, String b) 
    {
        int aPtr = a.length()-1;
        int bPtr = b.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0, bitAdd = 0;


        while(aPtr >= 0 || bPtr >= 0)
        {
            int aChr = (aPtr < 0 ? '0' : a.charAt(aPtr--)) - '0';
            int bChr = (bPtr < 0 ? '0' : b.charAt(bPtr--)) - '0';

            bitAdd = aChr ^ bChr ^ carry;
            carry =  (aChr & bChr) | (bChr & carry) | (aChr & carry);
            res.append(bitAdd);
            // System.out.println(aChr + " + " + bChr + " = " + carry + "" + bitAdd);
        }
        if(carry == 1)
            res.append(carry);

        return res.reverse().toString();
    }
}
