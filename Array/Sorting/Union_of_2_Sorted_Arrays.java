class Solution
{
    public static ArrayList<Integer> findUnion(int a[], int b[])
    {
        int aLength = a.length;
        int bLength = b.length;

        int aPointer = 0;
        int bPointer = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (aPointer < aLength && bPointer < bLength)
        {
            int value;

            if (a[aPointer] < b[bPointer])
            {
                value = a[aPointer];
                aPointer++;
            }
            else if (a[aPointer] > b[bPointer])
            {
                value = b[bPointer];
                bPointer++;
            }
            else
            {
                value = a[aPointer];
                aPointer++;
                bPointer++;
            }

            if (result.size() == 0 || result.get(result.size() - 1) != value)
            {
                result.add(value);
            }
        }

        while (aPointer < aLength)
        {
            if (result.size() == 0 || result.get(result.size() - 1) != a[aPointer])
            {
                result.add(a[aPointer]);
            }
            aPointer++;
        }

        while (bPointer < bLength)
        {
            if (result.size() == 0 || result.get(result.size() - 1) != b[bPointer])
            {
                result.add(b[bPointer]);
            }
            bPointer++;
        }

        return result;
    }
}
