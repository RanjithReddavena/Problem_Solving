class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,h=0;
        for(int w:weights){
            l=Math.max(w,l);
            h+=w;
        }
        int ans=0;
        while(l<=h){
            int c=l+(h-l)/2;
            if(check(weights,days,c)){
                ans=c;
                h=c-1;
            }else{
                l=c+1;
            }
        }
        return ans;

    }
    private boolean check(int[] weights,int days,int c){
        int d=1,current=0;
        for(int w:weights){
            if(current+w>c){
                d++; current=w;
            }else{
                current+=w;
            }
        }
        return d<=days;
    }
}