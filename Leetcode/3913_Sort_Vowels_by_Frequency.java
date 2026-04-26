class Solution {
    public String sortVowels(String s) 
    {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> firstIdx = new HashMap<>();
        
        int idxPos = 0;

        for(char x : s.toCharArray())
        {
            if(vowels.contains(x))
            {
                freq.put(x, freq.getOrDefault(x, 0) + 1);

                if(!firstIdx.containsKey(x))
                    firstIdx.put(x, idxPos);
            }
            idxPos++;
        }

        int vowCnt = freq.size();        
        MyHash[] sortVow = new MyHash[vowCnt];
        int i = 0;
        for(Map.Entry<Character, Integer> x : freq.entrySet())
        {
            sortVow[i++] = new MyHash(
                x.getKey(),
                x.getValue(),
                firstIdx.get(x.getKey())
            );
        }
        Arrays.sort(sortVow);

        StringBuilder finalVowSet = new StringBuilder();

        for(MyHash x : sortVow)
        {
            char currChar = x.getK();
            int currFreq = x.getV();
            for(int j = 0; j < currFreq; j++)
                finalVowSet.append(currChar);
        }

        StringBuilder res = new StringBuilder();
        int idx = 0;
        for(char x : s.toCharArray())
        {
            if(vowels.contains(x))
                res.append(finalVowSet.charAt(idx++));
            else
                res.append(x);
        }

        return res.toString();
    }
}

class MyHash implements Comparable<MyHash>{
    char vow;
    int freq;
    int firstIdx;

    MyHash(char vow, int freq, int firstIdx)
    {
        this.vow = vow;
        this.freq = freq;
        this.firstIdx = firstIdx;
    }

    public int getV()
    {
        return freq;
    }

    public char getK()
    {
        return vow;
    }

    @Override
    public int compareTo(MyHash other)
    {
        if(this.freq != other.freq)
            return Integer.compare(other.freq, this.freq);

        return Integer.compare(this.firstIdx, other.firstIdx);
    }
}  
