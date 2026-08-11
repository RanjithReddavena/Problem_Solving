class Solution {
    public int calculate(String s) {
        int n=s.length();
        int sign=1,num=0,res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if(ch=='+' || ch=='-' || ch==')' || i==n-1){
                res+=sign*num;
                num=0;
                if(ch==')'){
                    int preSign=st.pop();//sign
                    int preRes=st.pop(); //previous res
                    res=preRes+preSign*res;
                }else{
                    sign=(ch=='+')?1:-1;
                }
            }
            if(ch=='('){
                st.push(res);//current result
                st.push(sign);//current sign
                res=0;
                sign=1;
            }
        }
        return res;
    }
}