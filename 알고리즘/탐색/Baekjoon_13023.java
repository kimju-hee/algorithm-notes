import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_13023 {
    static ArrayList<Integer>[] graph;
    static boolean arrive;
    static boolean[] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            DFS(i, 1);
            visited[i] = false;
            if (arrive) {
                break;
            }
        }

        if (arrive) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void DFS(int v, int count) {
        if (count == 5) {
            arrive = true;
            return;
        }

        for (int i : graph[v]) {
            if (!visited[i]) {
                visited[i] = true;
                DFS(i, count + 1);
                visited[i] = false;
            }
        }
    }
}
