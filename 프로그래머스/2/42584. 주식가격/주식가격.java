import java.util.*;
class Solution {
    public int[] solution(int[] prices) {

        Queue<Integer> q = new LinkedList<>();
        for(Integer n : prices){
            q.add(n);
        }
        List<Integer> answer = new ArrayList<>();
        while(!q.isEmpty()){
            int pop = q.poll();
            int count = 0;
            for(Integer n : q){
                if(pop > n){
                    count++;
                    break;
                }
                count++;
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}