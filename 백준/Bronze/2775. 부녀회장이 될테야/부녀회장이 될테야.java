import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] dp = new int[15][15];
        for (int i = 1; i < 15 ; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            int floor = Integer.parseInt(bf.readLine());
            int ho = Integer.parseInt(bf.readLine());
            sb.append(dp[floor][ho]).append("\n");

        }
        System.out.println(sb.toString());

    }


}
