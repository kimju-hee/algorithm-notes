import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1300 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(bufferedReader.readLine());

        long start = 1, end = M;
        long ans = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            long count = 0;

            for (int i = 1; i < N + 1; i++) {
                count += Math.min(middle / i, N);
            }
            if (count < M) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }

        System.out.println(ans);
    }
}
