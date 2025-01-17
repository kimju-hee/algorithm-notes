import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_1377 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
            list2.add(temp);
        }

        Collections.sort(list);

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (list2.indexOf(list.get(i)) - i > max) {
                max = list2.indexOf(list.get(i)) - i;
            }
        }

        System.out.println(max + 1);

    }
}
