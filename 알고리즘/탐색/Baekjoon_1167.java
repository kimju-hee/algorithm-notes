import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_1167 {
    static ArrayList<Edge>[] graph;
    static int[] distance;
    static boolean[] visited;
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        graph = new ArrayList[N+1];

        for (int i = 1; i < N+1; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            while (true) {
                int E = sc.nextInt();
                if (E == -1) {
                    break;
                }
                int V = sc.nextInt();
                graph[S].add(new Edge(E,V));
            }
        }
        distance = new int[N+1];
        visited = new boolean[N+1];
        BFS(1);
        int Max = 1;
        for (int i = 2; i < N+1; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }

        distance = new int[N+1];
        visited = new boolean[N+1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);

    }

    public static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge i : graph[now]) {
                int e = i.e;
                int v = i.value;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now] + v;
                }
            }
        }
    }

    static class Edge {
        int e;
        int value;
        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}
