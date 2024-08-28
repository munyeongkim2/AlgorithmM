import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            q.add(priority);
        }
        int answer = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == q.peek()) {
                    q.poll();
                    answer++;
                    if(i == location) return answer;
                }

            }


        }
        return answer;
     
    }
}