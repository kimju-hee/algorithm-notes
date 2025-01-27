import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11047 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            list[N-i-1] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int i = 0;

        while (K > 0) {
            if (list[i] <= K) {
                count += K / list[i];
                K %= list[i];
            }
            i ++;
        }

        System.out.println(count);
    }
}
