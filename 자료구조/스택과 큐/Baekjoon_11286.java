import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11286 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return Integer.compare(o1, o2);
            } else {
                return Integer.compare(first, second);
            }
        });

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());

            if (temp == 0) {
                if (priorityQueue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(priorityQueue.poll());
                }
            } else {
                priorityQueue.add(temp);
            }
        }
    }
}
