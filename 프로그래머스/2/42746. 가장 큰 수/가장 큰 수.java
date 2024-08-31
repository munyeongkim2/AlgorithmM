import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new);
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
             
//                 String a = arr[j];
//                 String b = arr[j + 1];
//                 if ((b + a).compareTo(a + b) > 0) {
//                     String temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         } 시간초과
 Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
         answer = String.join("", arr);


        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}