import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        int number = 0 ;
        for (int i = 0; i < 3; i++) {
            String line = bf.readLine();
            try {
                number = Integer.parseInt(line);
                index = i;

            }catch (NumberFormatException e){
                continue;
            }
        }

        if(index == 0){
            number +=3;
        }else if(index == 1){
            number +=2;
        }else {
            number +=1;
        }

        int three = number % 3;
        int five = number % 5;

        if(three == 0 && five == 0){
            System.out.println("FizzBuzz");
        }else if(three == 0 && five != 0){
            System.out.println("Fizz");
        }else if(five == 0 && three != 0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }


    }
}

