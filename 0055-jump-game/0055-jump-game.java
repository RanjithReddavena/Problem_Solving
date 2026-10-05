class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;

        boolean[] dp = new boolean[n];

        // Last index is already the destination
        dp[n - 1] = true;

        // Work backwards
        for (int i = n - 2; i >= 0; i--) {

            // Check every position we can jump to
            for (int j = 1; j <= nums[i]; j++) {

                if (i + j < n && dp[i + j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }
}