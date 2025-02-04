import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 타일링 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        if (N > 3) {
            for (int i = 4; i < N+1; i++) {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
                System.out.println(dp[i]);
            }
        }

        System.out.println(dp[N]);
    }
}
