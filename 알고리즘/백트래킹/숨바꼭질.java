import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질 {
    static int K;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int answer = bfs(N, K);
        System.out.println(answer);

    }

    public static int bfs(int x, int count) {
        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, 0});
        visited[x] = true;


        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int position = temp[0];
            int time = temp[1];

            if (position == K) {
                return time;
            }
            if (position - 1 >= 0 && !visited[position -1]) {
                visited[position-1] = true;
                queue.add(new int[]{position-1, time+1});
            }
            if (position +1 <= 100000 && !visited[position+1]) {
                visited[position+1] = true;
                queue.add(new int[]{position+1, time+1});
            }
            if (position * 2 <= 100000 && !visited[position*2]) {
                visited[position*2] = true;
                queue.add(new int[]{position*2, time+1});
            }

        }

        return -1;
    }
}
