class Solution {
    public int rearrangeCharacters(String text, String target) 
    {
        int[] letters = new int[26];

        for(char x : text.toCharArray())
            letters[x-'a']++;

        int balloonCnt = Integer.MAX_VALUE;

        // String target = "balloon";
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for(char c : target.toCharArray())
            targetMap.put(c, targetMap.getOrDefault(c, 0)+1);
        
        for(char c : targetMap.keySet())
        {
            int charFreqInTar = targetMap.getOrDefault(c, -1);
            int charFreqInTxt = letters[c - 'a'];

            if(charFreqInTar != -1)
                balloonCnt = Math.min(balloonCnt, charFreqInTxt/charFreqInTar);
        }

        return balloonCnt;
        
    }
}
