import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4 {
    static int[] list;
    static int M;
    static StringBuffer stringBuffer;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new int[N];

        for (int i = 1; i < N+1; i++) {
            list[i-1] = i;
        }

        stringBuffer = new StringBuffer();
        backTracking(list, "", 0, -1);
        System.out.println(stringBuffer.toString());

    }
    public static void backTracking(int[] list, String current, int depth, int last) {
        if (depth == M) {
            stringBuffer.append(current + "\n");
            return;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= last) {
                backTracking(list, current + list[i] + " ", depth + 1, list[i]);
            }
        }
    }
}
