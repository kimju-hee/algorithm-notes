import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자의 합 구하기
public class Baekjoon_11720 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bufferedReader.readLine());
        String line = st.nextToken();

        char[] num = line.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num[i] - '0';
        }
        System.out.println(sum);
    }
}
