class Solution {
    public ArrayList<Integer> linearProbing(int[] arr, int m) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> hash = new ArrayList<>();
        for(int i = 0; i < m; i++)
            hash.add(-1);
        
        for(int i = 0; i < n; i++)
        {
            int mod = arr[i]%m;
            
            if(hash.get(mod) == -1 || hash.get(mod) == arr[i])
                hash.set(mod, arr[i]);
            else
            {
                int j = (mod+1)%m;
                while(j != mod && hash.get(j) != -1 && hash.get(j) != arr[i])
                    j = (j+1)%m;
                    
                if(j == mod)
                    continue;
                else
                    hash.set(j, arr[i]);
            }
        }
        
        return hash;
    }
}
