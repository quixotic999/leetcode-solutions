class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);
        int prefix = 0;
        int answer = 0;
        for (int n : nums) {
            prefix += n;
            answer += sums.getOrDefault(prefix - k, 0);
            sums.put(prefix, sums.getOrDefault(prefix, 0) + 1);
        }
        return answer;
    }
}
