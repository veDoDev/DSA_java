import java.util.*;

class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;

        // max heap for used elements (largest on top)
        PriorityQueue<int[]> heapUsed = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        // min heap for unused elements
        PriorityQueue<int[]> heapUnused = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );

        Set<Integer> used = new HashSet<>();
        long sum = 0;
        long ans = Long.MAX_VALUE;

        for (int right = 1; right < n; right++) {
            int left = right - dist - 1;

            // remove left element if it was used
            if (left > 0 && used.contains(left)) {
                used.remove(left);
                sum -= nums[left];

                // clean unused heap
                while (!heapUnused.isEmpty() && heapUnused.peek()[1] < left) {
                    heapUnused.poll();
                }

                // replace removed element if possible
                if (!heapUnused.isEmpty()) {
                    int[] e = heapUnused.poll();
                    heapUsed.offer(new int[]{e[0], e[1]});
                    used.add(e[1]);
                    sum += e[0];
                }
            }

            // add right element
            if (used.size() < k - 1) {
                heapUsed.offer(new int[]{nums[right], right});
                used.add(right);
                sum += nums[right];
            } else {
                // clean heapUsed top
                while (!heapUsed.isEmpty() && !used.contains(heapUsed.peek()[1])) {
                    heapUsed.poll();
                }

                if (!heapUsed.isEmpty() && nums[right] < heapUsed.peek()[0]) {
                    int[] removed = heapUsed.poll();
                    used.remove(removed[1]);

                    heapUsed.offer(new int[]{nums[right], right});
                    used.add(right);

                    sum += nums[right] - removed[0];

                    heapUnused.offer(new int[]{removed[0], removed[1]});
                } else {
                    heapUnused.offer(new int[]{nums[right], right});
                }
            }

            if (left >= 0) {
                ans = Math.min(ans, sum);
            }
        }

        return nums[0] + ans;
    }
}
