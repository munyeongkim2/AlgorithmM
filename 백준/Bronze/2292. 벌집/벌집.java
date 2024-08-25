import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int count = 7;
        if(a == 1){
            System.out.println(1);
            return;
        }
        if(a> 1 && a < 8){
            System.out.println(2);
            return;
        }
        for (int i = 3; i < a; i++) {
            count += i * 6 - 6;
            if(count >= a){
                System.out.println(i);
                break;
            }
        }

    }
}
