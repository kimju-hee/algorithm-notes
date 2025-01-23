import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_1253 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
        }

        Collections.sort(list);

        int count = 0;

        for (int i = 0; i < N; i++) {
            int target = list.get(i);
            int start = 0;
            int end = N - 1;

            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }
                int sum = list.get(start) + list.get(end);

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}
