class Solution {
    public List<List<Integer>> threeSum(int[] arr)
    {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) 
        {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) 
            {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0)    j++;
                else if (sum > 0)   k--;
                else 
                {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    while (j < k && arr[j] == arr[j + 1]) j++;
                    while (j < k && arr[k] == arr[k - 1]) k--;

                    j++;
                    k--;
                }
            }
        }

        return res;
    }
}
