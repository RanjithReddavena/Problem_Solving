class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int l=0,r=m-1,t=0,b=n-1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                ans.add(mat[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                ans.add(mat[i][r]);
            }
            r--;
            if(t<=b){
            for(int i=r;i>=l;i--){
                ans.add(mat[b][i]);
            }
            b--;
            }
            if(l<=r){
            for(int i=b;i>=t;i--){
                ans.add(mat[i][l]);
            }
            l++;
            }
        }
        return ans;
    }
}