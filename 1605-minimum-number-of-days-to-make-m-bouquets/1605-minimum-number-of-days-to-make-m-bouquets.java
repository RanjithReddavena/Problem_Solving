class Solution {
    public int minDays(int[] bloomDay,int m,int k){
        int n=bloomDay.length;
        long totalFlowers=(long)m*k;
        if(n<(totalFlowers)) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean isPossible=canMake(bloomDay,mid,m,k);
            if(isPossible){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean canMake(int[] bloomDay,int day,int m,int k){
        int n=bloomDay.length;
        int consecutive=0;
        int bouquets=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                consecutive++;
                if(consecutive==k){
                    bouquets++;
                    consecutive=0;
                }
            }else{
                consecutive=0;
            }
        }
        return bouquets>=m;
    }
}