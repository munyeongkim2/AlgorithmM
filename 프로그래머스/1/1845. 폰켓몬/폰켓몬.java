import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
                for (Integer i : nums) {
            set.add(i);
        }
        return nums.length / 2 < set.size() ?  nums.length / 2:  set.size();
        
        
    }
}