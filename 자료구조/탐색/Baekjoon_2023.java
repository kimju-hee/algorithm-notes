import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2023 {
    static int N;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(st.nextToken());

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

    }

    public static void DFS(int number, int length) {
        if (length == N) {
            if (isValid(number)) {
                System.out.println(number);
            }
        }

        for (int i = 1; i < 10; i++) {
            int num = number * 10 + i;
            if (isValid(num)) {
                DFS(num, length + 1);
            }
        }
    }

    public static boolean isValid(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
