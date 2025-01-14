import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균
public class Baekjoon_1546 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] score = new int[N];
        st = new StringTokenizer(bufferedReader.readLine());
        float max = 0;

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            score[i] = temp;
            if (temp > max) {
                max = temp;
            }
        }

        float sum = 0;

        for (int i = 0; i < N; i++) {
            sum += score[i] * 100 / max;
        }
        System.out.println(sum / N);
    }
}
