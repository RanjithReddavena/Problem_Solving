class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int l = 1; l <= n / 2; l++) {

            if (n % l != 0)
                continue;

            String pattern = s.substring(0, l);

            int i = 0;

            while (i < n) {

                int j = 0;

                while (j < pattern.length() &&
                       s.charAt(i) == pattern.charAt(j)) {

                    i++;
                    j++;
                }

                if (j != pattern.length()) {
                    break;
                }
            }

            if (i == n) {
                return true;
            }
        }

        return false;
    }
}