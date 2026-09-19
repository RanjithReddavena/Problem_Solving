class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
        List<Integer> inner=new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(i==j || j==0) inner.add(1);
            else{
                inner.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
        }
            ans.add(inner);
        }
        return ans.get(rowIndex);
    }
}