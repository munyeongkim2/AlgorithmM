import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] point = new float[n]; // 입력받을 숫자 배열 생성
        
        for (int i = 0; i < n; i++) {
            point[i] = sc.nextInt();
        }


        List<Integer> list = new ArrayList<>();
        for (float num : point) {
            list.add((int) num);
        }
        
        int max = Collections.max(list);


        List<Object> newList = new ArrayList<>();
        for (float num : point) {
            newList.add(num * 100 / max);
        }

        float sum = 0;
        for (Object num : newList) {
            sum += (float) num;
        }
        System.out.println(sum / n);

        sc.close();
    }
}
