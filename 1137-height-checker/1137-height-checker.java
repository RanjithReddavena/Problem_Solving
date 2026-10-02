class Solution {
    public int heightChecker(int[] heights) {
        int[] checker=heights.clone();
        Arrays.sort(checker);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=checker[i]) c++;
        }
        return c;
    }
}