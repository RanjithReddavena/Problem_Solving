class Solution {
    public int lengthOfLIS(int[] nums) {
        Set<Integer> st=new TreeSet<>();
        for(int x:nums){
            st.add(x);
        }
        int[] nums2=new int[st.size()];
        int i=0;
        for(int x:st){
            nums2[i]=x;
            i++;
        }
        return lcs(nums,nums2);
    }
    int lcs(int[] a,int[] b){
         int l1=a.length,l2=b.length;
        int[][] dp=new int[l1+1][l2+1];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                if(a[i]==b[j]){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                    }
                }
        }
        return dp[0][0];
    }
}