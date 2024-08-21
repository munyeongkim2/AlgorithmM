import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = gcd(arr[0], arr[1]);
        int answer2 = lcm(arr[0], arr[1]);
        System.out.println(answer);
        System.out.println(answer2);


    }
    //최대공약수
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    //최소공배수
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
