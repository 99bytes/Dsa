public class Q7 {

}

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {

            String sh = s.substring(i) + s.substring(0, i);

            if (sh.equals(goal)) {
                return true;
            }
        }

        return s.equals(goal);
    }
}