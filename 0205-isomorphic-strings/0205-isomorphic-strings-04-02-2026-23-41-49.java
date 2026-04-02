class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(h.containsKey(cs)){
                if(h.get(cs)!=ct){
                    return false;
                }
            }else
            if(h.containsValue(ct)){
             return false;   
            }
            h.put(cs,ct);
        }
        return true;
    }
}