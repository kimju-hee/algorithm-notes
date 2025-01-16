import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_2164 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            int temp = queue.poll();
            queue.add(temp);
        }

        System.out.println(queue.peek());
    }
}
