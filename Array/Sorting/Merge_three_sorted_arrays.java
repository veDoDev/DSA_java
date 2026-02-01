import java.util.*;

class Solution {
    public static ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;

        // Merge while all three have elements
        while (i < a.length && j < b.length && k < c.length) 
        {
            int min = Math.min(a[i], Math.min(b[j], c[k]));
            result.add(min);

            if (a[i] == min) i++;
            else if (b[j] == min) j++;
            else k++;
        }

        // Merge remaining two arrays
        while (i < a.length && j < b.length) 
        {
            if (a[i] <= b[j]) result.add(a[i++]);
            else result.add(b[j++]);
        }

        while (j < b.length && k < c.length) 
        {
            if (b[j] <= c[k]) result.add(b[j++]);
            else result.add(c[k++]);
        }

        while (i < a.length && k < c.length) 
        {
            if (a[i] <= c[k]) result.add(a[i++]);
            else result.add(c[k++]);
        }

        // Add remaining elements
        while (i < a.length) result.add(a[i++]);
        while (j < b.length) result.add(b[j++]);
        while (k < c.length) result.add(c[k++]);

        return result;
    }
}
