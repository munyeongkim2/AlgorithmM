import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int minDay =  (arr[2] - arr[0]) / (arr[0] - arr[1]) ;
        int n = (arr[2] - arr[0]) % (arr[0] - arr[1]);
        if(n > 0){
            System.out.println(minDay + 2);
        }
        else {
            System.out.println(minDay + 1 );
        }




    }
}
