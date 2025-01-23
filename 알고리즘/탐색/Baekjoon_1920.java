import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1920 {
    static int[] list;
    static int[] list2;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        list = new int[N];
        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            list[i] = a;
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        list2 = new int[M];
        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            list2[i] = a;
        }

        Arrays.sort(list);

        for (int i = 0; i < M; i++) {
            int target = list2[i];
            boolean found = false;

            int start = 0;
            int end = list.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                int value = list[mid];
                if (value > target) {
                    end = mid - 1;
                }
                if (value < target) {
                    start = mid + 1;
                }
                if (value == target) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
