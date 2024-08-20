import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String[] str;
        Set<String> strSet = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            strSet.add(bf.readLine());

        }

        str = strSet.toArray(new String[0]);
        Arrays.sort(str);

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                if(str[j].length() > str[j+1].length()){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]).append("\n");
        }
        System.out.println(sb);

    }
}
