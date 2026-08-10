class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;
    }
    void dfs(char[][] g,int i,int j){
        if(i<0 || i>=g.length || j>=g[0].length || j<0){
            return;
        }
        if(g[i][j]=='0'){
            return;
        }
        g[i][j]='0';
        dfs(g,i-1,j);
        dfs(g,i+1,j);
        dfs(g,i,j-1);
        dfs(g,i,j+1);
    }
}