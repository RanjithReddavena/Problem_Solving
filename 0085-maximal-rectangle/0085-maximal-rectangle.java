class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int maxArea=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            
            int height=0;
            if(i==n){
                height=0;
            }else{
                height=h[i];
            }

            while(!st.isEmpty() && height<h[st.peek()]){
                int currh=h[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,currh*width);
            }
            st.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int n=matrix[0].length;
        int[] h=new int[n];
        int maxArea=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    h[j]++;
                }else{
                    h[j]=0;
                }
            }
            maxArea=Math.max(maxArea,largestRectangleArea(h));
        }
        return maxArea;
    }
}