class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(isConnected[i][i]==1){
                count++;
                dfs(isConnected,i);
            }
        }
        return count;
    }
    void dfs(int[][] mat,int r){
        mat[r][r]=0;
        for(int i=0;i<mat.length;i++){
            if(mat[r][i]==1){
                mat[r][i]=0;
                mat[i][r]=0;
                dfs(mat,i);
            }
        }
    }
}