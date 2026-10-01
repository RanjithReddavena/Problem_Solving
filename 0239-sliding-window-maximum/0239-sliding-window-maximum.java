class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> q=new ArrayDeque<>();
        int l=0,j=0;
        for(int r=0;r<n;r++){
            while(!q.isEmpty()&& nums[q.peekLast()]<=nums[r])
                q.pollLast();
            q.addLast(r);
            if(q.peekFirst()<l)
                q.pollFirst();
            if(r-l+1==k){
                ans[j++]=nums[q.peekFirst()];
                l++;
            }
        }
        return ans;
    }
}