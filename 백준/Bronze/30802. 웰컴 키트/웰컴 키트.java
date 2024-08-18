import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(bf.readLine());
        int[] tee = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count= 0 ;
        for (int i : tee) {
            if(i == 0){
                continue;
            }
            if(i < arr[0]){
                count++;
            }else {
                if(i % arr[0] ==0){
                    count += i / arr[0] ;
                }else{
                    count += i / arr[0] + 1;
                }

            }

        }
        System.out.println(count);
        if(people < arr[1]){
            System.out.println(0 + " " + people);
        }else{
            System.out.println(people /arr[1] + " " + people % arr[1]);
        }


    }
}
