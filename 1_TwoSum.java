class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> steps = new HashMap<>();
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (steps.containsKey(target - nums[i])) {
                if (nums[i] != target - nums[i]) {
                    steps.put(nums[i], i);
                    result = new int[] {steps.get(target - nums[i]), steps.get(nums[i])};
                    return result; 
                } else {
                    result = new int[] {steps.get(target - nums[i]), i};
                    return result;
                }
            }
            steps.put(nums[i], i);
        }
        return result;
    }
}
