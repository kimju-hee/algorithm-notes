import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1456 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] num = new int[B + 1];
        for (int i = 1; i < B + 1; i++) {
            num[i] = i;
        }

        for (int i = 2; i < B + 1; i++) {
            if (num[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= Math.sqrt(B); j = i + j) {
                num[i] = 0;
            }
        }

        int count = 0;
        for (int i = 2; i < B + 1; i++) {
            if (num[i] == 0) {
                continue;
            }
            for (int j = i; j < B; j++) {
                if (num[i] != 0) {
                    continue;
                }
                if (num[i] * j == 0) {
                    count += 1;
                    num[num[i] * j] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
