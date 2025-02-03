import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 쉬운최단거리 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int n;
    static int m;
    static int[][] graph;

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        int[][] answer = new int[n][m];

        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(st.nextToken());
                graph[i][j] = temp;
                if (temp == 2) {
                    x = i;
                    y = j;
                }
                if (temp == 0) {
                    answer[i][j] = 0;
                } else {
                    answer[i][j] = -1;
                }
            }
        }

        bfs(x, y, answer);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                stringBuilder.append(answer[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
    }

    public static void bfs(int x, int y, int[][] answer) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        answer[x][y] = 0;

        boolean[][] visited = new boolean[n][m];
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int a = temp[0];
            int b = temp[1];

            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && !visited[nx][ny] && graph[nx][ny] != 0) {
                    visited[nx][ny] = true;
                    answer[nx][ny] = answer[a][b] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
