import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        st = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list[i] = temp;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        int answer = 0;

        for (int i = 1; i < N; i++) {
            list[i] += list[i-1];
            answer += list[i];
        }
        System.out.println(answer + list[0]);
    }
}
