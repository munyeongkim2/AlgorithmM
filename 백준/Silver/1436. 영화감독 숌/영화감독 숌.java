import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10000];
        int count = 0 ;
        int i = 0;
        while(count < 10000) {

            if(String.valueOf(i).contains("666")){
                arr[count] = Integer.parseInt(String.valueOf(i));
                count++;
            }
            i++;
        }
        int n = Integer.parseInt(bf.readLine());

        System.out.println(arr[n-1]);

    }

}
