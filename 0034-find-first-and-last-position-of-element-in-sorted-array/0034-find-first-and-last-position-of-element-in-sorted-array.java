
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int idx1 = -1, idx2 = -1;

        while (i <= j) {
            int m = i + (j - i) / 2;

            if (nums[m] < target) {
                i = m + 1;
            } else if (nums[m] > target) {
                j = m - 1;
            } else {
                idx1 = m;
                j = m - 1;
            }
        }

        
        i = 0;
        j = nums.length - 1;

        
        while (i <= j) {
            int m = i + (j - i) / 2;

            if (nums[m] < target) {
                i = m + 1;
            } else if (nums[m] > target) {
                j = m - 1;
            } else {
                idx2 = m;
                i = m + 1;
            }
        }

        return new int[]{idx1, idx2};
    }
}