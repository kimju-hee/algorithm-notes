import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2512 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] list = new int[N+1];
        st = new StringTokenizer(bufferedReader.readLine());
        int end = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            list[i] = a;
            if (a > end) {
                end = a;
            }
        }
        st = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(st.nextToken());

        int start = 0;
        int max = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;

            for (int l : list) {
                if (l <= mid) {
                    sum += l;
                } else {
                    sum += mid;
                }
            }

            if (sum <= M) {
                max = Math.max(max, mid);
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(max);
    }
}
