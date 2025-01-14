import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 5
public class Baekjoon_11660 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] list = new int[N + 1][N + 1];
        int[][] sum = new int[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j < N + 1; j++) {
                int temp = Integer.parseInt(st.nextToken());
                list[i][j] = temp;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + list[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];

            System.out.println(result);
        }
    }
}
