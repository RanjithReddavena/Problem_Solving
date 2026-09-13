class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            int k=rowShift[i]%n;
            reverse(grid[i],0,k-1);
            reverse(grid[i],k,n-1);
            reverse(grid[i],0,n-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[j][i];
                grid[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int k=colShift[i]%n;
            reverse(grid[i],0,k-1);
            reverse(grid[i],k,n-1);
            reverse(grid[i],0,n-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[j][i];
                grid[j][i]=temp;
            }
        }
        return grid;
    }
   void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}