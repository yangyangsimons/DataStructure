import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] s = {1, 0, -1, 0, -2, 2};
        int t = 0;
        List index = fourSum(s, t);
        System.out.println(index);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // create result list
        List<List<Integer>> result = new ArrayList<>();
        // check input before operation;
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            // avoid duplicated elements;
            while (i > 0 && nums[i] == nums[i - 1]) {
                i++;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                // avoid duplicated elements;
                while (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                }
                // use two pointer
                int startPoint = j + 1;
                int endPoint = nums.length - 1;
                while (startPoint < endPoint) {
                    // avoid duplicated elements, move from left to right;
                    while (startPoint < endPoint && nums[startPoint] == nums[startPoint - 1]) {
                        startPoint++;
                    }

                    // avoid duplicated elements, move from right to left;
                    while (startPoint < endPoint && endPoint < nums.length - 2 && nums[endPoint] == nums[endPoint + 1]) {
                        endPoint--;
                    }
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[startPoint] + (long) nums[endPoint];
                    if (sum == target) {
                        List<Integer> fourElements = new ArrayList<>();
                        fourElements.add(nums[i]);
                        fourElements.add(nums[j]);
                        fourElements.add(nums[startPoint]);
                        fourElements.add(nums[endPoint]);
                        result.add(fourElements);
                        startPoint++;
                        endPoint--;
                    } else if (sum < target) {
                        startPoint++;
                    } else {
                        //sum > target;
                        endPoint--;
                    }
                }
            }
        }
        return result;
    }
}
