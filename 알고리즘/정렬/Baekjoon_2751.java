import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2751 {
    public static int[] A, tmp;
    public static long result;
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        A = new int[N+1];
        tmp = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            A[i] = Integer.parseInt(bufferedReader.readLine());
        }

    }

    public static void merge_sort(int s, int e) {
        if (e - s < 1) {
            return;
        }
        int m = s + (e - s) / 2;
        merge_sort(s, m);
        merge_sort(m + 1, e);
        for (int i = s; i < e+1; i++) {
            tmp[i] = A[i];
        }
        int k = s;
        int index1 = s;
        int index2 = m+1;
        while (index1 <= m && index2 <= e) {
            if (tmp[index1] > tmp[index2]) {
                A[k]
            }
        }
    }
}
