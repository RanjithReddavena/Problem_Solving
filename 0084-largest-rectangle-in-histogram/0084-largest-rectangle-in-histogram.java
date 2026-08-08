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
}