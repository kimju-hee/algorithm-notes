import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        quickSelect(list, 0, N - 1, K - 1);
        System.out.println(list[K - 1]);
    }

    public static void quickSelect(int[] list, int start, int end, int k) {
        if (start < end) {
            int pivot = partition(list, start, end);
            if (pivot == k) {
                return;
            } else if (k < pivot) {
                quickSelect(list, start, pivot - 1, k);
            } else {
                quickSelect(list, pivot + 1, end, k);
            }
        }
    }

    public static int partition(int[] list, int start, int end) {
        int pivot = list[start];
        int i = start + 1;
        int j = end;

        while (i <= j) {
            while (i <= end && list[i] < pivot) {
                i++;
            }
            while (j > start && list[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(list, i++, j--);
            }
        }

        swap(list, start, j);
        return j;
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
