class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum is in right half
                low = mid + 1;
            } 
            else if (nums[mid] < nums[high]) {
                // Minimum is at mid or in left half
                high = mid;
            } 
            else {
                // nums[mid] == nums[high]
                // Cannot decide, reduce search space
                high--;
            }
        }

        return nums[low];
    }
}
