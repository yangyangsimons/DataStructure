
public int[] twoSum(int[] numbers, int target){
	int[] result = new int[2];
	if(numbers.length < 2){
		throw new RuntimeException("length of arrary is not properly");
	}
	int left = 0;
	int right = numbers.length - 1;
	while(left < right){
		int sum = numbers[left] + numbers[right];
		if(sum == target){
			result[0] = left + 1;
			result[1] = right + 1;
			break;
		}
		if(sum < target){
			left++;
		}
		if(sum > target){
			right--;
		}
	}
	return result;
}