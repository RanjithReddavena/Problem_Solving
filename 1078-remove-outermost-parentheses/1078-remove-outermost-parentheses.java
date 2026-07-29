class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()) res+='(';
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    res+=')';
                }
            }
        }
        return res;
    }
}