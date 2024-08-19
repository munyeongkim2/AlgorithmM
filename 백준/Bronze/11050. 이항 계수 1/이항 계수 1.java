import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println(solved(arr[0], arr[1]));


    }

    public static int solved(int n, int k) {
        if (k > n) {
            return 0;
        }
        if ( k == 0 || k == n) {
            return 1;
        }

        return solved(n -1, k -1) + solved(n - 1, k );

    }
}

