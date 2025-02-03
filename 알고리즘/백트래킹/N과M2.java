import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M2 {
    static int[] number;
    static int M;
    static boolean[] used;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        number = new int[N];
        for (int i = 1; i < N+1; i++) {
            number[i-1] = i;
        }

        backTracking(number, "", 0, new boolean[N]);
    }

    public static void backTracking(int[] number, String current, int start, boolean[] used) {
        if (current.length() == 2 * M) {
            System.out.println(current.trim());
        }

        for (int i = start; i < number.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            backTracking(number, current + number[i] + " ", i, used);
            used[i] = false;
        }
    }
}
