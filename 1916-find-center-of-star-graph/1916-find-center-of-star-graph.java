class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int[] degree=new int[n+2];
        for(int[] e:edges){
            int u=e[0],v=e[1];
            degree[u]++; degree[v]++;
        }
        for(int i=1;i<=n;i++){
            if(degree[i]==n) return i;
        }
        return -1;
    }
}