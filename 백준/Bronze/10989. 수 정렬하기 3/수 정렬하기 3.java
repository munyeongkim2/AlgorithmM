import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(bf.readLine());
        int[] arr = new int[people];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < people; i++) {

            arr[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr) {
            builder.append(i).append('\n');

        }

        System.out.println(builder);


    }
}
