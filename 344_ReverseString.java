class Solution {
    public void reverseString(char[] s) {
        int end = s.length - 1;
        int i = 0;
        while (i < end - i) {
            char temp = s[i];
            s[i] = s[end - i];
            s[end - i] = temp;
            i++;
        }
    }
}
