class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int s=-1,e=-1;

        while(l<=r){
            int m=(l+r)/2;

            if(nums[m]==target){
                s=m;
                r=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }

        if(s==-1)return new int[]{-1,-1};

        l=0;
        r=nums.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(nums[m]==target){
                e=m;
                l=m+1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
            }
        }

        return new int[]{s,e};
    }
}