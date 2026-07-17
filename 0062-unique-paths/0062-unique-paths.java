class Solution {
    static int[][] grid=new int[101][101];
   static{
   for(int i=0;i<101;i++){
        for(int j=0;j<101;j++){
            if(i==0 || j==0){
                grid[i][j]=1;
            }
            else{
                grid[i][j]=grid[i-1][j]+grid[i][j-1];
            }
        }
    }
   }
    
    public int uniquePaths(int m, int n) {
     // if(m==1 || n==1 )  return 1;
      //return uniquePaths(m-1,n)+uniquePaths(m,n-1);
      return grid[m-1][n-1];
    }
       
}