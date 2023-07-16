/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create the answer array;
        int[] answer = new int[2];
        // check input before operation;
        if (nums == null || nums.length < 2) {
            return answer;
        }

        // sort nums for two pointer method;
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                answer[0] = nums[start];
                answer[1] = nums[end];
                return answer;
            }else if (sum < target) {
                start ++;
            } else {
                // sum > target
                end --;
            }
        }
        answer[0] = -1;
        answer[1] = -1;
        return answer;
    }
}
// @lc code=end

