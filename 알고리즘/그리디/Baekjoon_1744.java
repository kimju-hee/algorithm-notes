import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> plus = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        int zeroCount = 0, result = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            if (num > 1) {
                plus.add(num);
            } else if (num == 1) {
                result += 1;
            } else if (num == 0) {
                zeroCount++;
            } else {
                minus.add(num);
            }
        }

        while (plus.size() > 1) {
            int num1 = plus.poll();
            int num2 = plus.poll();
            result += num1 * num2;
        }
        if (!plus.isEmpty()) {
            result += plus.poll();
        }

        while (minus.size() > 1) {
            int num1 = minus.poll();
            int num2 = minus.poll();
            result += num1 * num2;
        }
        if (!minus.isEmpty() && zeroCount == 0) {
            result += minus.poll();
        }

        System.out.println(result);
    }
}
