/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //create answer List;
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        //check input;
        if(nums == null) {
            return answer;
        }

        // using helper function to traverse the whole array;
        List<Integer> list = new ArrayList<>();
        helper(answer, list, nums, 0);
        return answer;
    }
    private void helper(List<List<Integer>> answer, List<Integer> list, int[] nums, int pos) {
        // the back tracking end condition;
        answer.add(new ArrayList<>(list));
        for (int i = pos; i < nums.length; i ++) {
            list.add(nums[i]);
            helper(answer, list, nums, i + 1);
            // remove
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end

