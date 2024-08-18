import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int min = 0;

        for (int i = 0; i < n - 1; i++) {
            String s= String.valueOf(i);
            int[] arr = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
            int i1 = Integer.parseInt(s) + Arrays.stream(arr).sum();
            if(i1 == n){
                min = i;
                break;
            }
        }
        System.out.println(min);

    }
}
