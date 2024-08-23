import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
    
        List<String>[] list = new List[100];

        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }

        for (String s : completion) {
            list[Math.abs(s.hashCode()) % list.length].add(s);
        }

        for (String s : participant) {
            if(!list[Math.abs(s.hashCode()) % list.length].remove(s)){
                return s;
            }
        }
         
        return null;
    }
    
    
}