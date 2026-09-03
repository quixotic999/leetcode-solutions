class Solution {
    public boolean isValid(String s) {
        Deque<Character> curr = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                curr.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && (curr.isEmpty() || curr.pop() != '(')) {
                return false;
            } else if (s.charAt(i) == ']' && (curr.isEmpty() || curr.pop() != '[')) {
                return false;
            } else if (s.charAt(i) == '}' && (curr.isEmpty() || curr.pop() != '{')) {
                return false;
            }
        }
        return curr.isEmpty();
    }
}
