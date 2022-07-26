import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};

        int target = 0;
        int index = solution(nums,target);
        System.out.println(index);
    }

    public static int solution(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                if (nums[mid] == target) {
                    return mid;
                }
                if(nums[mid] > target){
                    if( nums[start] > target){
                        start = mid;
                    }else{
//                    start < target
                        end = mid;
                    }
                }else{
//                    nums[mid] < target
                    if(nums[start] < target){
                        start = mid;
                    }else{

                    }
                }

            }
            if (nums[mid] < nums[start]) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid;
                } else {
                    // nums[mid] > target
                    end = mid;
                }
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;

    }
}
