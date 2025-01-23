import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_1260 {
    static ArrayList<Integer>[] graph;
    static boolean visited1[];
    static boolean visited2[];
    static StringBuilder stringBuilder;
    static StringBuilder stringBuilder1;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        visited1 = new boolean[N+1];
        visited2 = new boolean[N+1];

        stringBuilder = new StringBuilder();
        stringBuilder1 = new StringBuilder();

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

        for (int i = 1; i <= N; i++) {
            graph[i].sort(null);
        }

        DFS(V);
        System.out.println(stringBuilder.toString());
        BFS(V);
        System.out.println(stringBuilder1.toString());

    }

    public static void DFS(int v) {
        stringBuilder.append(v);
        visited1[v] = true;

        for (int i : graph[v]) {
            if (!visited1[i]) {
                visited1[i] = true;
                stringBuilder.append(" ");
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        boolean first = true;

        while (!queue.isEmpty()) {
            int V = queue.poll();
            if (first) {
                stringBuilder1.append(V);
                first = false;
            } else {
                stringBuilder1.append(" ").append(V);
            }
            visited2[V] = true;

            for (int i : graph[V]) {
                if (!visited2[i]) {
                    visited2[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
