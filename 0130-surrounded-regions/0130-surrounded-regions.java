class Solution {
    public void solve(char[][] board) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i);
            }
        }
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O'){
                dfs(board,m-1,i);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
        }
        for(int i=0;i<m;i++){
            if(board[i][n-1]=='O'){
                dfs(board,i,n-1);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char[][] board,int r,int c){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length) return;
        if(board[r][c]!='O') return;
        board[r][c]='#';
        dfs(board,r-1,c);
        dfs(board,r+1,c);
        dfs(board,r,c-1);
        dfs(board,r,c+1);
    }
}