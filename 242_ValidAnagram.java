class Solution {
    public boolean isAnagram(String a, String b) {
        char[] s = a.toCharArray();
        char[] t = b.toCharArray();
        int[] n1 = new int[26];
        int[] n2 = new int[26];
        for (char c : s) {
            n1[c - 'a'] += 1;
        }
        for (char c : t) {
            n2[c - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (n1[i] != n2[i]) {
                return false;
            }
        }
        return true;
    }
}
