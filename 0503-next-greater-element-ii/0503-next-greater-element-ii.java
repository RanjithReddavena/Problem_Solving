class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> st=new Stack<>()  ;
      int[] r=new int[nums.length];
      Arrays.fill(r,-1);
      for(int i=2*nums.length-1;i>=0;i--){
        while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
            st.pop();
        }
        if(!st.isEmpty()){
            r[i%nums.length]=st.peek();
        }
        st.push(nums[i%nums.length]);
      }
      return r;
    }
}