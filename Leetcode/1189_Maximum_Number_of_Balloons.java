class Solution {
    public int maxNumberOfBalloons(String text) 
    {
        int[] letters = new int[26];

        for(char x : text.toCharArray())
            letters[x-'a']++;

        int balloonCnt = Integer.MAX_VALUE;

        String target = "balloon";
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for(char c : target.toCharArray())
            targetMap.put(c, targetMap.getOrDefault(c, 0)+1);
        
        for(int i = 0; i < 26; i++)
        {
            int charFreqInTar = targetMap.getOrDefault((char)('a' + i), -1);
            int charFreqInTxt = letters[i];

            if(charFreqInTar != -1)
                balloonCnt = Math.min(balloonCnt, charFreqInTxt/charFreqInTar);
        }

        return balloonCnt;
    }
}
