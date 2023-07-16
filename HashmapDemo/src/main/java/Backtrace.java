import java.util.ArrayList;
import java.util.List;

public class Backtrace {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        boolean[] visited = new boolean[nums.length];
        System.out.println(subSet(nums).toString());

    }
    private static List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        // construct the sole answer.
        List<Integer> curr = new ArrayList<>();
        // back trace method;
        helper(0, nums, curr, result);

        return result;
    }

    private static void helper(int start, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            helper (i + 1, nums, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

}
