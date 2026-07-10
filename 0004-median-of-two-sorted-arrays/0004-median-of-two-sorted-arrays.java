class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int i=0,j=0;
        int prev=0,curr=0;
        for(int k=0;k<=length/2;k++){
            prev=curr;
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<=nums2[j]){
                    curr=nums1[i++];
                }else{
                    curr=nums2[j++];
                }
            }else if(i<nums1.length){
                curr=nums1[i++];
            }else{
                curr=nums2[j++];
            }
        }
        if((length&1)==1) return curr;
        return (curr+prev)/2.0;
    }
}