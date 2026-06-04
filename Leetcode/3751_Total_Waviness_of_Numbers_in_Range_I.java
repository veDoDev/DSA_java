class Solution {
    public int totalWaviness(int num1, int num2) 
    {
        int total = 0;

        for (int i = num1; i <= num2; i++)
            total += waves(i);

        return total;
    }

    private int waves(int x) 
    {
        String s = String.valueOf(x);

        if (s.length() < 3) 
            return 0;

        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) 
        {
            int left = s.charAt(i - 1) - '0';
            int mid = s.charAt(i) - '0';
            int right = s.charAt(i + 1) - '0';

            if ((mid > left && mid > right) ||
                (mid < left && mid < right))
                count++;
        }

        return count;
    }
}
