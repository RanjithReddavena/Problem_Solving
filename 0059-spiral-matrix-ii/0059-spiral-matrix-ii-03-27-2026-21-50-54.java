class Solution {
    public int[][] generateMatrix(int n) {
       int[][] mat=new int[n][n];
        int l=0,r=n-1,t=0,b=n-1,val=1;;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                mat[t][i]=val++;
            }
            t++;
            for(int i=t;i<=b;i++){
                mat[i][r]=val++;
            }
            r--;
            if(t<=b){
            for(int i=r;i>=l;i--){
                mat[b][i]=val++;
            }
            b--;
            }
            if(l<=r){
            for(int i=b;i>=t;i--){
                mat[i][l]=val++;
            }
            l++;
            }
        }
        return mat; 
    }
}