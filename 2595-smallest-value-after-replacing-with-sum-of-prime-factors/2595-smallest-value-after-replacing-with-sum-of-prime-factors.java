class Solution{
    public int smallestValue(int n){
        int[] lpf=new int[n+1];
        for(int i=2;i<=n;i++){
            if(lpf[i]==0){
                for(int j=i;j<=n;j+=i){
                    if(lpf[j]==0) lpf[j]=i;
                }
            }
        }
        while(true){
            int sum=0;
            int temp=n;
            while(temp>1){
                sum+=lpf[temp];
                temp/=lpf[temp];
            }
            if(sum==n)
                return n;
            n=sum;
        }
    }
}