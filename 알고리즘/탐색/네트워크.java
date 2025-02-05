import java.util.HashSet;

class Solution {
    static int[] visited;
    static HashSet<Integer> set;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, n, computers);
                answer ++;
            }
        }

        return answer;
    }

    public void dfs(int x, int n, int[][] computers) {
        visited[x] = 1;
        for (int i = 0; i < n; i ++) {
            if (computers[x][i] == 1 && visited[i] == 0) {
                dfs(i, n, computers);
            }
        }



    }
}