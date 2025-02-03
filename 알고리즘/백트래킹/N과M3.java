import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M3 {
    static int[] number;
    static int M;
    static StringBuffer stringBuffer;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        number = new int[N];
        for (int i = 1; i < N+1; i++) {
            number[i-1] = i;
        }

        stringBuffer = new StringBuffer();

        backTracking(number, "", 0);
        System.out.println(stringBuffer.toString());
    }

    public static void backTracking(int[] number, String current, int depth) {
        if (depth == M) {
            stringBuffer.append(current + "\n");
            return;
        }

        for (int i = 0; i < number.length; i++) {
            backTracking(number, current + number[i] + " ", depth + 1);
        }
    }
}
