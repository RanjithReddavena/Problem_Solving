class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int d[]=new int[numCourses];
        for(int x[]:prerequisites){
            int c=x[0],p=x[1];
            graph.get(p).add(c);
            d[c]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(d[i]==0) q.offer(i);
        }
        int completed=0;
        while(!q.isEmpty()){
            int current=q.poll();
            completed++;
            for(int x:graph.get(current)){
                d[x]--;
                if(d[x]==0) q.offer(x);
            }
        }
        return completed==numCourses;
    }
}