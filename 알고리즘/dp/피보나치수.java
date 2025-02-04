import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피보나치수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;

        if (N > 1) {
            for (int i = 2; i < N+1; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        System.out.println(dp[N]);
    }
}
