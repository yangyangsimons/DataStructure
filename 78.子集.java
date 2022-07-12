/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        // check input;
        if (nums == null) {
            return answer;
        }

        // single solution;
        List<Integer> list = new ArrayList<>();
        helper(answer, list, nums, pos);
        return answer;
        
    }
}
// @lc code=end

