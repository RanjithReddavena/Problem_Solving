class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int pile:piles){
            r=Math.max(r,pile);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            int ho=0;
            for(int pile:piles){
                ho+=Math.ceil((double)pile/mid);
            }
            if(ho<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}