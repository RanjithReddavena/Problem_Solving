class Solution {
    public int createSortedArray(int[] instructions) {
        long ans=0; int max=100000;
        SegmentTree obj=new SegmentTree(max);
        for(int x:instructions){
            long c1=obj.rangeQuery(0,x-1);
            long c2=obj.rangeQuery(x+1,max);
            ans=ans+Math.min(c1,c2);
            ans=ans%1000000007;
            obj.freq(x);
        }
        return (int)ans;
    }
}
class SegmentTree{
    int n;
    long[] st;
    int mxval=0;
    SegmentTree(int mxval){
        st=new long[4*(mxval+1)];
        this.mxval=mxval;
    }
    long rangeQuery(int l,int r){
        if(l>r) return 0;
        return rangehelper(0,0,mxval,l,r);
    }
    long rangehelper(int idx,int ss,int se,int qs,int qe){
        if(qe<ss || qs>se) return 0;
        if(qs<=ss && se<=qe) return st[idx];
        int mid=(ss+se)/2;
        long leftans=rangehelper(2*idx+1,ss,mid,qs,qe);
        long rightans=rangehelper(2*idx+2,mid+1,se,qs,qe);
        return leftans+rightans;
    }
    void freq(int x){
        int idx=0,ss=0,se=mxval;
        while(ss<se){
            int mid=(ss+se)/2;
            if(x<=mid){
                idx=2*idx+1;
                se=mid;
            }else{
                idx=2*idx+2;
                ss=mid+1;
            }
        }
        while(true){
            st[idx]+=1;
            if(idx==0) break;
            idx=(idx-1)/2;
        }
    }
}