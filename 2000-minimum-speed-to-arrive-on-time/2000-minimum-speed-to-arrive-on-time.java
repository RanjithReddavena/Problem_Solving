class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n=dist.length;
        if(hour<=n-1) return -1;
        int l=1,h=10_000_000;
        long ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            long total=0;
            for(int i=0;i<n-1;i++){
                total+=(dist[i]+(long)mid-1)/mid;
            }
double lastTime = dist[n-1] / (double) mid;
            double reqTime=total+lastTime;
            if(reqTime<=hour){
                ans=mid;
                h=mid-1;

            }else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
}