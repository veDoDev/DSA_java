class Solution {
    public int passwordStrength(String password) 
    {
        int n = password.length();
        List<Character> visited = new ArrayList<>();
        int score = 0;

        for(char x : password.toCharArray())
        {
            if(visited.contains(x))
                continue;
            else
            {
                visited.add(x);
                if(x >= 'a' && x <= 'z')
                    score++;
                else if(x >= 'A' && x <= 'Z')
                    score += 2;
                else if(x >= '0' && x <= '9')
                    score += 3;
                else if(x == '!' || x == '@' || x == '#' || x == '$')
                    score += 5;
            }
        }

        return score;
    }
}
