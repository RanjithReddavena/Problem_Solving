class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                s1.push(ch);
            }else{
                if(s1.isEmpty()){
                    return false;
                }
                char top=s1.pop();
                if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{') return false;
            }
        }
        return s1.isEmpty();
    }
}