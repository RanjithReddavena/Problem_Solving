class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        if(p.length()>s.length()) return res;
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int l=0,k=p.length();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(r-l+1>k){
                char old=s.charAt(l);
                if(map.containsKey(old)){
                    map.put(old,map.get(old)+1);
                }
                l++;
            }

            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }

            if(r-l+1==k){
                boolean check=true;
                for(int v:map.values()){
                    if(v!=0){
                        check=false;
                    break;
                    }
                }
            if(check){
                res.add(l);
            }
            }


        }
        return res;
    }
}