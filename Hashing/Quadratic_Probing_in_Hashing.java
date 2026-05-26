class Solution {
    public ArrayList<Integer> quadraticProbing(int[] arr, int m) 
    {   
        int collisions = 0;
        
        ArrayList<Integer> res = new ArrayList<>(m);
        for(int i = 0; i < m; i++)
            res.add(i, -1);
        
        for(int x : arr)
        {
            int mod = x%m;
            int jumper = mod;
            collisions = 0;
            while(res.get(jumper) != -1 && collisions < m && res.get(jumper) != x)
            {
                collisions++;
                jumper = (mod + (collisions * collisions)) % m;
                // System.out.println(mod + " " + Math.pow(collisions[mod], 2));
            }
            if(res.get(jumper) == -1)
                res.set(jumper, x);
        }
        
        return res;
    }
}
