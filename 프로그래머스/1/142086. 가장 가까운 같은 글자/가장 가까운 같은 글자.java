import java.util.Stack;
class Solution {
    public int[] solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i < s.length() ; i++){
            if (stack.contains(s.charAt(i))) {
                int index = stack.lastIndexOf(s.charAt(i));
                answer[i] = i - index;
            }
            else{
                answer[i] = -1;
            }
            stack.push(s.charAt(i));
        }
        return answer;
    }
}