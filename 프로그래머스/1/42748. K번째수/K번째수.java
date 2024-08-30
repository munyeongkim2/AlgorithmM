import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];
        int index = 0;
        for(int[] arr : commands){
            for(int i = arr[0] ; i < arr[1] + 1; i++){
                list.add(array[i - 1]);
            }
            Collections.sort(list);
            answer[index] = list.get(arr[2] - 1);
            index++;
            list.clear();
        }
        return answer;
    }
}