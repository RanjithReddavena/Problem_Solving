class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a= new ArrayList<>();
        h(a,"",n,n);
        return a;
    }
    private void h(List<String> a,String s,int o,int c){
        if (o==0&& c==0){
            a.add(s);
            return;
        }
        if(o>0) {
            h(a,s+"(",o-1,c);
        }
        if(c>o){
            h(a,s+")",o,c-1);
        }
    }
}