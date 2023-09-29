public class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        boolean asc = false;
        int i = 1;
        while (i < nums.length && nums[i] == nums[0]) {
            i++;
        }
        if (i == nums.length) {
            return true;
        }
        if (nums[i] - nums[0] > 0) {
            asc = true;
        }
        for (; i < nums.length; i++) {
            if (asc) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
