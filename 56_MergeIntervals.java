class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int[] curr : intervals) {
            if (res.get(res.size() - 1)[1] >= curr[0]) {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], curr[1]);
            } else {
                res.add(curr);
            }
        }
        return res.toArray(new int[0][]);
    }
}
