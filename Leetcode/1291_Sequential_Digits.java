class Solution {
    public List<Integer> sequentialDigits(int low, int high) 
    {
        int lLim = (int)Math.log10(low) + 1;
        int uLim = (int)Math.log10(high) + 1;
        List<Integer> res = new ArrayList<>();

        findAllNums(low, high, 1, 1, res);
        Collections.sort(res);
        return res;        
    }

    private void findAllNums(int l, int h, int curr, int currStart, List<Integer> res)
    {
        if(curr >= l && curr <= h)
            res.add(curr);

        int d = curr%10;
        if(d == 9)
        {
            if(currStart == 9)
                return;
            findAllNums(l,h,currStart+1, currStart+1, res);
            return;
        }

        curr = (curr*10) + (d+1);
        findAllNums(l,h,curr,currStart,res);
    }
}
