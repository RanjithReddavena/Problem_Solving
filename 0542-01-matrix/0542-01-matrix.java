class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dir={
            {1,0},{-1,0},{0,1},{0,-1}
        };
        int r=mat.length,c=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int cr=curr[0],cc=curr[1];
            for(int i=0;i<4;i++){
                int ncr=cr+dir[i][0],ncc=cc+dir[i][1];
                if(ncr>=0 && ncc>=0 && ncr<r && ncc<c && mat[ncr][ncc]==-1){
                    mat[ncr][ncc]=mat[cr][cc]+1;
                    q.offer(new int[]{ncr,ncc});
                }
            }
        }
        return mat;
    }
}