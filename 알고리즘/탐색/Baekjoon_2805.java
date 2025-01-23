import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2805 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        st = new StringTokenizer(bufferedReader.readLine());
        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (max < a) {
                max = a;
            }
            list[i] = a;
        }

        int answer = 0;

        while (min <= max) {
            int mid = (min + max) / 2;
            long sum = 0;

            for (int i : list) {
                if (i > mid) {
                    sum += (i - mid);
                }
            }

            if (sum >= M) {
                answer = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
