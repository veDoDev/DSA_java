//============================================================================================= works only for ASCII coded words ===============================================================================
class Solution {

    // Each character -> 3 digit ASCII + '@' after each word
    public static String encode(List<String> strs) 
    {
        StringBuilder encString = new StringBuilder();

        for (String x : strs) 
        {
            for (char ch : x.toCharArray()) 
            {
                String ascii = String.valueOf((int) ch);

                // pad to 3 digits
                while (ascii.length() < 3)  ascii = "0" + ascii;

                encString.append(ascii);
            }
            encString.append("@"); // end of word
        }
      
        System.out.println(encString.toString());
        return encString.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> res = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        StringBuilder currLetter = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
        {

            char c = str.charAt(i);

            if (c == '@') 
            {
                // end of word
                res.add(word.toString());
                word.setLength(0);
                currLetter.setLength(0);
                continue;
            }

            currLetter.append(c);

            // if we got 3 digits -> convert to a char
            if (currLetter.length() == 3) 
            {
                int ascii = Integer.parseInt(currLetter.toString());
                word.append((char) ascii);
                currLetter.setLength(0);
            }
        }

        return res;
    }
}
//============================================================================================= works for all kinds of Strings (UTF-8) ===============================================================================
class Solution {

    // Encode: len#string
    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();

        for (String s : strs)
            sb.append(s.length()).append('#').append(s);
        
        return sb.toString();
    }

    // Decode: read length until '#', then read exactly length chars
    public List<String> decode(String s) 
    {
        List<String> res = new ArrayList<>();
        int i = 0;
        int n = s.length();

        while (i < n) 
        {
            int j = i;

            // read number until '#'
            while (s.charAt(j) != '#') 
                j++;

            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1; // move past '#'

            // read exact length characters
            String word = s.substring(i, i + length);
            res.add(word);

            i += length;
        }

        return res;
    }
}
