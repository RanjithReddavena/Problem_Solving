class Solution {
    public double myPow(double x, int n) {
        int exp=n;
        if(exp<0){
            x=1/x;
            exp=-exp;
        }
        return pow(x,exp,1);
    }
    double pow(double x,long n,double ans){
        if(n==0) return ans;
        if((n&1)==1) ans*=x;
        return pow(x*x,n/2,ans);
    }
}