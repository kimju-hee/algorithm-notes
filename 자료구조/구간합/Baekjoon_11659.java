import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기
public class Baekjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] list = new int[N+1];
        int[] sum = new int[N+1];

        st = new StringTokenizer(bufferedReader.readLine());
        int num = 0;
        for (int i = 1; i < N+1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            num += temp;
            list[i] = temp;
            sum[i] = num;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(sum[b] - sum[a-1]);
        }
    }
}
