class Solution {
    public void rotate(int[] nums, int k) {
        int i=0,j=nums.length-1;
        k=k%nums.length;
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;j--;
        }
        int l=0,m=k-1;
        while(l<m){
            int te=nums[l];
            nums[l]=nums[m];
            nums[m]=te;
            l++;m--;
        }
        l=k;m=nums.length-1;
        while(l<m){
            int te=nums[l];
            nums[l]=nums[m];
            nums[m]=te;
            l++;m--;
        }
    }
}