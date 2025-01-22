import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_11724 {
    static ArrayList<Integer>[]  graph;
    static boolean visited[];
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i < N+1; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        int count = 0;
        for (int i = 1; i < N+1; i++) {
            if (!visited[i]) {
                count ++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    public static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : graph[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
