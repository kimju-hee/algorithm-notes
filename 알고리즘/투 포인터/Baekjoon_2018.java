import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수들의 합 5
public class Baekjoon_2018 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i < N+1; i++) {
            int sum = i;
            for (int j = i+1; j < N+1; j++) {
                sum += j;
                if (sum == N) {
                    count += 1;
                    break;
                }
                if (sum > N) {
                    break;
                }
            }
        }
        System.out.println(count + 1);
    }
}
