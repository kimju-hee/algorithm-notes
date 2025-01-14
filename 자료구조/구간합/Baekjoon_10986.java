import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10986 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());

        long[] list = new long[N];
        long[] calculate = new long[M];
        long count = 0;

        list[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            list[i] = list[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int temp = (int) list[i] % M;
            if (temp == 0) {
                count ++;
            }
            calculate[temp] ++;
        }

        for (long c : calculate) {
            if (c > 1) {
                count += (c * (c-1) / 2);
            }
        }
        System.out.println(count);
    }
}
