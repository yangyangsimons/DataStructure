Class Solution{
	public List<List<Integer>> fourSum(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length < 4){
			return result;
		}

		Arrays.sort(nums);

		for(int i = 0; i < nums.length - 3; i ++){
			for(int j = i + 1; j < nums.length - 2; j ++){
				int startPoint = i + 2;
				int endPoint = nums.length;
				while(startPoint < endPoint){
					long sum = (long)nums[i] + (long)nums[j] + (long)nums[startPoint] + (long)nums[endPoint];
					if(sum > Integer.MAX_VALUE){
						return result;
					}
					if(sum == target){
						List<Integer> resultArray = new ArrayList<>();
						resultArray.add(nums[i]);
						resultArray.add(nums[j]);
						resultArray.add(nums[startPoint]);
						resultArray.add(nums[endPoint]);

						if(!result.contains(resultArray)){
							result.add(resultArray);
						}
						startPoint ++;
					}
					if(sum < target){
						startPoint ++;
					}
					if(sum > target){
						endPoint --;
					}
				}
			}
		}
		return result;
	}
}