import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 주몽
public class Baekjoon_1940 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list[i] = temp;
        }

        Arrays.sort(list);

        int start = 0;
        int end = N-1;
        int count = 0;

        while (start < end) {
            if (list[start] + list[end] == M) {
                count += 1;
                start += 1;
            }
            else if (list[start] + list[end] > M) {
                end -= 1;
            }
            else {
                start += 1;
            }

        }

        System.out.println(count);

    }
}
