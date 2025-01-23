import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2343 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        int end = 0;
        int start = 0;
        st = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            end += list[i];

            if (start < list[i]) {
                start = list[i];
            }
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int count = 1;

            for (int i = 0; i < N; i++) {
                if (sum + list[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum += list[i];
            }

            if (count > M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(start);
    }
}
