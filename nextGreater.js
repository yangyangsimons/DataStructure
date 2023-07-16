var nextGreaterElements = function(nums) {
    // use monotonic stack, stack restore the index;
    let stack = [];
    let result = Array(nums.length).fill(-1, 0)
    let n = nums.length;
    for (let i = 0; i < 2 * n; i ++ ) {
        while(!stack.length == 0 && nums[stack[stack.length - 1]] < nums[i % n]) {
           let index = stack.pop();
           console.log(index);
           result[index] = nums[i % n]
        }
        stack.push(i % n);
    }
    return result;
};

nums = [1,2,1];
console.log(nextGreaterElements(nums));