class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length,e=0,o=1;
        while(e<n && o<n){
            while(e<n && nums[e]%2==0) e+=2;
            while(o<n && nums[o]%2!=0) o+=2;
            if(e<n && o<n){
                int t=nums[e];
                nums[e]=nums[o];
                nums[o]=t;
            }
        }
        return nums;
    }
}