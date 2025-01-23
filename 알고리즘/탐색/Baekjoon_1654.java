import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1654 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] list = new int[K];
        long max = 0;


        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            list[i] = a;
            if (max < a) {
                max = a;
            }
        }

        long start = 1;

        while (start <= max) {
            long mid = (start + max) / 2;
            long sum = 0;

            for (int i : list) {
                sum += i / mid;
            }

            if (sum >= N) {
                start = mid + 1;
            }
            if (sum < N) {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
