import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1427 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        String N = st.nextToken();
        int[] list = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            int temp = N.charAt(i) - '0';
            list[i] = temp;
        }

        for (int i = 0; i < N.length(); i++) {
            int max = list[i];
            int idx = i;
            for (int j = i + 1; j < N.length(); j++) {
                if (list[j] > max) {
                    max = list[j];
                    idx = j;
                }
            }
            if (list[i] != max) {
                int temp = list[idx];
                list[idx] = list[i];
                list[i] = temp;
            }
        }

        StringBuffer bf = new StringBuffer();

        for (int l : list) {
            bf.append(l);
        }
        System.out.println(bf.toString());
    }
}
