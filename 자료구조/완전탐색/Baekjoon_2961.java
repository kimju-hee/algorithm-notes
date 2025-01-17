import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2961 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] food = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            food[i][0] = a;
            food[i][1] = b;
        }

        int num = 1;
        int min = Integer.MAX_VALUE;
        int am = 0;

        while (num <= N) {
            for (int i = 0; i < N; i++) {
                int sum = 1;
                int sum2 = 0;
                for (int j = i; j < num + j; j++) {
                    System.out.println(j);
                    sum *= food[i][0];
                    sum2 += food[i][1];
                if (Math.abs(sum2 - sum) < min) {
                    min = Math.abs(sum2 - sum);
                }
            }
            num += 1;
        }
        System.out.println(min);
    }
}
