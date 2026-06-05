class Solution {
    public String convert(String s, int numRows) {
         if (numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();

        }
        int r=0;
        int d=1;
        for(char ch:s.toCharArray()){
            sb[r].append(ch);
            if(r==0){
                d=1;
            }else if(r==numRows-1){
                d=-1;
            }
            r+=d;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder strb:sb){
            ans.append(strb);
        }
        return ans.toString();
    }
}