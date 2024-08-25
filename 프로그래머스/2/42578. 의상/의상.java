import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        int answer = 0;
        int p = 1;
        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.get(clothe[1]).add(clothe[0]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(clothe[0]);
                map.put(clothe[1], list);
            }
        }

        for (List<String> value : map.values()) {
            answer += value.size();
            p *= value.size();
        }
        if(map.keySet().size() == 1){
            return answer;
        }
        return p+ answer;
    }
}