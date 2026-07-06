//-----------------------------------------------------------------------------------Approach 2 : greedy---------------------------------------------------------------------------------------------------------------
class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] romans = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(romans[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
} 
//-----------------------------------------------------------------------------------Approach 1 : recursion---------------------------------------------------------------------------------------------------------------
class Solution {
    private char[] symTab = {'I','V','X','L','C','D','M'};
    public String intToRoman(int num) 
    {
        StringBuilder res = new StringBuilder();
        addNextInt(num + "", res);
        return res.toString();  
    }

    private void addNextInt(String num, StringBuilder res)
    {
        int curr = Integer.parseInt(num);
        if(curr <= 0)
            return;

        int i = 0;// 1 2 3
        int currNum = 1;//5 10 50
        int fives = 5;//50
        int tens = 1;//10 100

        while(i < 7 && curr - currNum >= 0)
        {
            if(i%2 == 0)
            {
                tens *= 10;
                currNum = fives;
            }
            else
            {
                fives *= 10;
                currNum = tens;
            }
            i++;
        }

        if(i%2 == 0)
            currNum = Math.max(5, fives/10);
        else
            currNum = Math.max(1, tens/10);

        if(num.charAt(0) == '4')
        {
            res.append(symTab[i-1]);
            res.append(symTab[i]);
            curr -= currNum*4;
        }
        else if(num.charAt(0) == '9')
        {
            res.append(symTab[i-2]);
            res.append(symTab[i]);
            curr -= (currNum/5)*9;
        }
        else
        {
            res.append(symTab[i-1]);
            curr -= currNum;
        }

        addNextInt(curr + "", res);
    }
}
