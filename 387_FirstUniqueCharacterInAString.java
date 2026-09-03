class Solution {
    public int firstUniqChar(String s) {
        int[] found = new int[26];
        for (int i = 0; i < s.length(); i++) {
            found[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (found[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
