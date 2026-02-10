class Solution 
{
    public int longestBalanced(int[] nums) 
    {
        int n = nums.length;

        // Try larger window sizes first
        for (int windowSize = n; windowSize >= 2; windowSize--)
        {
            HashMap<Integer, Integer> frequency = new HashMap<>();
            int distinctOddCount = 0;
            int distinctEvenCount = 0;

            int left = 0;
            int right = 0;   // right is exclusive (window = [left, right))

            // Build initial window of size windowSize
            while (right < windowSize)
            {
                int value = nums[right];

                if (!frequency.containsKey(value))
                {
                    if (value % 2 == 0)
                        distinctEvenCount++;
                    else
                        distinctOddCount++;
                }

                frequency.put(value, frequency.getOrDefault(value, 0) + 1);
                right++;
            }

            // Slide window across array
            while (right < n)
            {
                if (distinctOddCount == distinctEvenCount)
                    return windowSize;

                // Remove left element
                int leftValue = nums[left];
                frequency.put(leftValue, frequency.get(leftValue) - 1);

                if (frequency.get(leftValue) == 0)
                {
                    frequency.remove(leftValue);

                    if (leftValue % 2 == 0)
                        distinctEvenCount--;
                    else
                        distinctOddCount--;
                }

                left++;

                // Add right element
                int rightValue = nums[right];

                if (!frequency.containsKey(rightValue))
                {
                    if (rightValue % 2 == 0)
                        distinctEvenCount++;
                    else
                        distinctOddCount++;
                }

                frequency.put(rightValue, frequency.getOrDefault(rightValue, 0) + 1);
                right++;
            }

            // Check last window
            if (distinctOddCount == distinctEvenCount)
                return windowSize;
        }

        return 0;
    }
}
