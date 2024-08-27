import java.io.IOException;
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {              Queue<Integer> proQ = new LinkedList<>();
        Queue<Integer> speedQ= new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            proQ.offer(progresses[i]);
            speedQ.offer(speeds[i]);
        }
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        int index = 0;
        while (!proQ.isEmpty()) {
            index++;
            int size = proQ.size();
            for (int i = 0; i < size; i++) {
                if((index * speedQ.peek()) + proQ.peek() >= 100) {
                    proQ.poll();
                    speedQ.poll();
                    count++;
                }
            }

            if(count > 0){
                answer.add(count);
                count = 0;
            }


        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
