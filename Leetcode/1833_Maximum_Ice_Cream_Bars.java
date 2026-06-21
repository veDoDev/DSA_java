class Solution {
    public int maxIceCream(int[] costs, int coins) 
    {
        int n = costs.length;
        int maxCost = Integer.MIN_VALUE;

        for(int cost : costs)
            maxCost = Math.max(maxCost, cost);

        int[] sorted = new int[maxCost+1];
        for(int cost : costs)
            sorted[cost]++;

        int idx = 0;
        int totalSpend = 0;
        int iceCreams = 0;
        while(idx < maxCost+1)
        {
            if(sorted[idx] == 0 )
                idx++;
            else
            {
                if(totalSpend + idx > coins)
                    break;

                sorted[idx]--;
                totalSpend += idx;
                iceCreams++;
            }
        }

        return iceCreams;
    }
}
