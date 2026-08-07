class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int l1=t1.length(),l2=t2.length();
        int[][] dp=new int[l1+1][l2+1];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                if(t1.charAt(i)==t2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{

                dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}