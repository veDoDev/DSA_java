class Solution {
    public ArrayList<ArrayList<String>> accMerge(String[][] arr) 
    {
        int n = arr.length;
        HashMap<String, Integer> mailMap = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            int m = arr[i].length;
            String mail = "GU";
            //check if any email is preexisting
            for(int j = 1; j < m; j++)
            {
                if(mailMap.containsKey(arr[i][j]))
                {
                    mail = arr[i][j];
                    break;
                }
            }
            
            int currIdx = mail.equals("GU") ? (i) : (mailMap.get(mail));
                
            for(int j = 1; j < m; j++)
            {
                int oldIdx = mailMap.getOrDefault(arr[i][j], -1);
                if(oldIdx == -1)
                    mailMap.put(arr[i][j], currIdx);
                else if(oldIdx != currIdx)
                    for(Map.Entry<String, Integer> e : mailMap.entrySet())
                        if(e.getValue() == oldIdx)
                            e.setValue(currIdx);
            }
        }
        // System.out.println("mailMap : " + mailMap);
        
        HashMap<Integer, ArrayList<String>> nameToMail = new HashMap<>();
        
        for(Map.Entry<String, Integer> e : mailMap.entrySet())
        {
            String currMail = e.getKey();
            Integer currName = e.getValue();
            
            if(!nameToMail.containsKey(currName))
                nameToMail.put(currName, new ArrayList<String>());
                
            nameToMail.get(currName).add(currMail);
        }
        
        // System.out.println("nameToMail : " + nameToMail);
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        
        for(Map.Entry<Integer, ArrayList<String>> ntm : nameToMail.entrySet())
        {
            String currName = arr[ntm.getKey()][0];
            Collections.sort(ntm.getValue());
            
            ArrayList<String> cand = new ArrayList<>();
            cand.add(currName);
            for(String s : ntm.getValue())
                cand.add(s);
                
            res.add(cand);
        }
        
        return res;
    }
}
