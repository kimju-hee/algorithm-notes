import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon_1715 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> list = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());

            list.add(a);
        }

        int num = 0;

        if (N == 1) {
            System.out.println(0);
            return;
        } else {

            while (list.size() > 1) {
                int a = list.poll();
                int b = list.poll();
                int sum = a + b;
                list.add(sum);
                num += sum;
            }
        }

        System.out.println(num);
    }
}
