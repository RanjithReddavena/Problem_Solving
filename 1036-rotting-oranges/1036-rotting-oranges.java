class Solution {

    public int orangesRotting(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int  fc=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});

                }else if(grid[i][j]==1){
                    fc++;
                }
            }
        }
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        int m=0;

        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int[] curr=q.poll();
                int cr=curr[0],cc=curr[1];
                for(int i=0;i<4;i++){
                    int nr=cr+dx[i];
                    int nc=cc+dy[i];
                    if(nr>=0 && nc>=0 && nr<r && nc<c && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        fc--;
                    }
                }
            }
            if(!q.isEmpty()){
                m++;
            }
        }

        return fc==0?m:-1;
    }

}