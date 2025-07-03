class Solution {
    public int substrCount(String s, int k) 
    {
        int n = s.length();
        if (k > n) return 0;

        Map<Character, Integer> freq = new HashMap<>();
        int count = 0;

        // preload first window [0 .. k-1]
        for (int i = 0; i < k; i++)
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);

        // check the first window
        if (freq.size() == k - 1) count++;

        int tail = 0;
        for (int head = k; head < n; head++, tail++) 
        {
            // remove the char that slides out
            char out = s.charAt(tail);
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);

            // add the new char that slides in
            char in = s.charAt(head);
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            // window is now s[tail+1 .. head]  (length k)
            if (freq.size() == k - 1) count++;

            // // ─── DEBUG ───
            // System.out.println(
            //     "Window [" + (tail + 1) + ", " + head + "] → "
            // + s.substring(tail + 1, head + 1)
            // + " | distinct = " + freq.size());
            // System.out.println(freq);
        }
        return count;
    }

}
