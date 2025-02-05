import java.util.LinkedList;
import java.util.Queue;

class 게임맵최단거리 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] visited;
    int[][] map;
    public int solution(int[][] maps) {
        int answer = 0;
        visited = new int[maps.length][maps[0].length];
        map = maps;
        int[][] distance = new int[map.length][map[0].length];
        distance[0][0] = 1;


        answer = bfs(0,0, distance);

        System.out.println(answer);

        return answer;
    }
    public int bfs(int x, int y, int[][] distance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = 1;


        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int ox = temp[0];
            int oy = temp[1];

            if (ox == map.length-1 && oy == map[0].length-1) {
                return distance[map.length-1][map[0].length-1];
            }

            for (int i = 0; i < 4; i++) {
                int nx = ox + dx[i];
                int ny = oy + dy[i];

                if (0 <= nx && nx < map.length && 0 <= ny && ny < map[0].length && visited[nx][ny] == 0 && map[nx][ny] == 1) {
                    queue.add(new int[]{nx,ny});
                    visited[nx][ny] = 1;
                    distance[nx][ny] = distance[ox][oy] + 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        게임맵최단거리 game = new 게임맵최단거리();
        int[][] input = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        game.solution(input);
    }
}