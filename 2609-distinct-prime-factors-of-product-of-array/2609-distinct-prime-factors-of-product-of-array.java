class Solution {
            static int[] lpf=new int[1001];
        static{
        for(int i=2;i<=1000;i++){
            if(lpf[i]==0){
                for(int j=i;j<=1000;j+=i){
                    if(lpf[j]==0) lpf[j]=i;
                }
            }
        }
        }
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            while(n>1){
                int p=lpf[n];
                set.add(p);
                while(n%p==0)
                    n/=p;
            }
        }
        return set.size();
    }
}