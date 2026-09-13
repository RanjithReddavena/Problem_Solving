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
        for(int c=0;c<mat.length;c++){
            if(mat[r][c]==1){
                mat[r][c]=0;
                mat[c][r]=0;
                dfs(mat,c);
            }
        }
    }
}