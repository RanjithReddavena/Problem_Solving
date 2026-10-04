class Solution {
    public int trap(int[] height) {
       int l=0,r=height.length-1;
       int lmaxH=0,rmaxH=0;
       int water=0;
       while(l<=r){

        if(rmaxH<lmaxH){
            water+=Math.max(0,rmaxH-height[r]);
            rmaxH=Math.max(rmaxH,height[r]);
            r--;
        }else{
            water+=Math.max(0,lmaxH-height[l]);
            lmaxH=Math.max(lmaxH,height[l]);
            l++;
        }

       }
       return water;
    }
}