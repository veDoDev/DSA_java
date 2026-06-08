// User function Template for Java

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : arr)
            map.put(s, map.getOrDefault(s, 0)+1);
            
        int maxVote = -1;
        String winner = "";
            
        for(Map.Entry<String, Integer> m : map.entrySet())
        {
            String currCand = m.getKey();
            int currVotes = m.getValue();
            
            if(currVotes > maxVote)
            {
                winner = currCand;
                maxVote = currVotes;
            }
            else if(currVotes == maxVote && currCand.compareTo(winner) < 0)
                winner = currCand;
        }
            
        return new String[]{winner, "" + maxVote};
    }
}
