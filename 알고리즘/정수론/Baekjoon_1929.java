import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1929 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] num = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            num[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (num[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= N; j = i + j) {
                num[j] = 0;
            }
        }
        for (int i = M; i <= N; i++) {
            if (num[i] != 0) {
                System.out.println(num[i]);
            }
        }
    }
}
