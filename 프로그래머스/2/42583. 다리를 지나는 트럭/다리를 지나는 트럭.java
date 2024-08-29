import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {       
       Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> arrive = new LinkedList<>();

        for(int i = 0; i < bridge_length  ; i ++ ){
            bridge.add(0);
        }
        for(int n : truck_weights){
            truck.add(n);
        }
        int time = 0;

        while(true){
            if(arrive.size() == truck_weights.length){
                break;
            }
            int out = bridge.poll();
            if (out != 0) {
                arrive.add(out);
            }
            int bridgeSum = bridge.stream().mapToInt(Integer::intValue).sum();
            if(!truck.isEmpty() && truck.peek() + bridgeSum <= weight ){
                int currentTruck = truck.poll(); 
                bridge.add(currentTruck);
            }else{
                bridge.add(0);
            }
            time++;

        }
        return (time);
    }
}