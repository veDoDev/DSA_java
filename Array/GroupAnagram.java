class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String, List<String>> hashInpt = new HashMap<>();

        for (String str : strs)
        {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!hashInpt.containsKey(sortedStr)) {
                hashInpt.put(sortedStr, new ArrayList<>());
            }
            hashInpt.get(sortedStr).add(str);
        }

        return new ArrayList<>(hashInpt.values());
    }
    
}
