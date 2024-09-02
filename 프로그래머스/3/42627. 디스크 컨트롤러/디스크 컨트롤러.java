import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        int count = 0;
        int index = 0;
        int time = 0;
        int answer = 0;
        while(count < jobs.length){
            while(index < jobs.length && jobs[index][0] <= time){
                q.offer(jobs[index++]);
            }
            if(q.isEmpty()){
                time = jobs[index][0];
            }else{
                int[] job = q.poll();
                time += job[1];
                answer += time - job[0];
                count++;
            }
            
        }
        return answer / jobs.length;
    }
}