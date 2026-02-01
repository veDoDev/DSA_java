class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) 
    {
        int n = arr1.length;
        int m = arr2.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int ptr1 = 0,
            ptr2 = 0;
            
        while(ptr1 < n && ptr2 < m)
        {
            if(arr1[ptr1] <= arr2[ptr2])
            {
                if(arr1[ptr1] == arr2[ptr2])
                    res.add(arr1[ptr1]);
                    
                ptr1++;
                while(ptr1 < n && arr1[ptr1] == arr1[ptr1-1])
                    ptr1++;
            }
            else 
            {
                ptr2++;
                while(ptr2 < m && arr2[ptr2] == arr2[ptr2-1])
                    ptr2++;
            }
                
        }
        
        return res;
        
    }
}
