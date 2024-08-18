import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(bf.readLine());
            arr[i] = a;

        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(Math.round((float) Arrays.stream(arr).sum() / n));
        System.out.println(arr[(n-1)/2]);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }

        ArrayList<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0); // 최빈값 중 두 번째로 작은 값

        System.out.println(mode);
        System.out.println(arr[n-1] - arr[0]);



    }
}
