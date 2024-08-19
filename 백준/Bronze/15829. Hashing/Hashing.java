import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Map<String, Integer> map = new HashMap<>();
        char current = 'a';
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf(current), i + 1);
            current ++;
        }

        String[] str = bf.readLine().split("");
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += map.get(str[i]) * Math.pow(31, i);

        }
        System.out.println(answer);

    }
}
