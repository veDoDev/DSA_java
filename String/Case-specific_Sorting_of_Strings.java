//----------------------------------------------------------------------------------------Aproach 1 : (Arrays.sort)-----------------------------------------------------------------------------------------------------------
class Solution {
    public static String caseSort(String s) 
    {
        int n = s.length();
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);
        
        int lowerPtr = 0;
        int upperPtr = 0;
        
        while(lowerPtr < n && Character.isUpperCase(sortedS[lowerPtr]))
            lowerPtr++;
        while(upperPtr < n && Character.isLowerCase(sortedS[upperPtr]))
            upperPtr++;
            
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < n)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                res.append(sortedS[lowerPtr]);
                lowerPtr++;
                while(lowerPtr < n && Character.isUpperCase(sortedS[lowerPtr]))
                    lowerPtr++;
            }
            else
            {
                res.append(sortedS[upperPtr]);
                upperPtr++;
                while(upperPtr < n && Character.isLowerCase(sortedS[upperPtr]))
                    upperPtr++;
            }
            i++;
        }
        
        return res.toString();
    }
}
//----------------------------------------------------------------------------------------Aproach 2 : (Counting sort)-----------------------------------------------------------------------------------------------------
class Solution {
    public static String caseSort(String s) 
    {
        int[] upperFreq = new int[26];
        int[] lowerFreq = new int[26];

        for(char ch : s.toCharArray())
        {
            if(Character.isLowerCase(ch))
                lowerFreq[ch - 'a']++;
            else
                upperFreq[ch - 'A']++;
        }

        int lowerPtr = 0;
        int upperPtr = 0;

        while(lowerPtr < 26 && lowerFreq[lowerPtr] == 0)
            lowerPtr++;

        while(upperPtr < 26 && upperFreq[upperPtr] == 0)
            upperPtr++;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch))
            {
                result.append((char)('a' + lowerPtr));
                lowerFreq[lowerPtr]--;

                while(lowerPtr < 26 && lowerFreq[lowerPtr] == 0)
                    lowerPtr++;
            }
            else
            {
                result.append((char)('A' + upperPtr));
                upperFreq[upperPtr]--;

                while(upperPtr < 26 && upperFreq[upperPtr] == 0)
                    upperPtr++;
            }
        }

        return result.toString();
    }
}
