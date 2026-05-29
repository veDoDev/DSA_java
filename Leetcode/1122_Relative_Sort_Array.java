//-------------------------------------------------------------------------------------------Approach 1--Generic-------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------Map-oriented + QuickSort------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int n = arr1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr2.length; i++)
            if(!map.containsKey(arr2[i]))
                map.put(arr2[i], i);
            
        Integer[] arr1Cpy = new Integer[n];
        for(int i = 0; i < n; i++)
            arr1Cpy[i] = arr1[i];
            
        Arrays.sort(arr1Cpy, (a,b) -> {
            if(map.containsKey(a) && map.containsKey(b))
                return map.get(a) - map.get(b);
            else if(map.containsKey(a))
                return -1;
            else if(map.containsKey(b))
                return 1;
            else
                return a-b;
        });

        for(int i = 0; i < n; i++)
            arr1[i] = arr1Cpy[i];

        return arr1;
    }
}
//-------------------------------------------------------------------------------------------Approach 2--Constraint-Focused--------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------Counting Sort-based ------------------------------------------------------------------------------------------------------
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int n = arr1.length;
        int[] freq = new int[1001];

        for(int x : arr1)
            freq[x]++;

        int[] res = new int[n];
        int i = 0;

        for(int x : arr2)
        {
            while(freq[x] > 0)
            {
                res[i++] = x;
                freq[x]--;
            }
        }

        for(int k = 0; k <= 1000; k++)
        {
            while(freq[k] > 0)
            {
                res[i++] = k;
                freq[k]--;
            }
        }

        return res;
    }
}
