class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
            List<Integer>[] b=new ArrayList[nums.length+1];
            for(int key:mp.keySet()){
                int f=mp.get(key);
                if(b[f]==null){
                    b[f]=new ArrayList<>();
                }
                b[f].add(key);
            }
          int[] ans=new int[k];
          int idx=0;
          for(int i=b.length-1;i>=0&&idx<k;i--){
            if(b[i]!=null){
                for(int n:b[i]){
                    ans[idx++]=n;
                    if(idx==k){
                        break;
                    }
                }
            }
          }
          return ans;
    }
}