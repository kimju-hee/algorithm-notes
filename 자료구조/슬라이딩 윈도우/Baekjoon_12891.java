import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_12891 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int count = 0;

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bufferedReader.readLine());
        String line = st.nextToken();

        st = new StringTokenizer(bufferedReader.readLine());
        int[] list = new int[4];
        list[0] = Integer.parseInt(st.nextToken());
        list[1] = Integer.parseInt(st.nextToken());
        list[2] = Integer.parseInt(st.nextToken());
        list[3] = Integer.parseInt(st.nextToken());

        int[] current = new int[4];
        for (int i = 0; i < P; i++) {
            addChar(current, line.charAt(i));
        }

        if (isValid(current, list)) {
            count += 1;
        }

        for (int i = P; i < S; i++) {
            removeChar(current, line.charAt(i - P));
            addChar(current, line.charAt(i));

            if (isValid(current, list)) {
                count += 1;
            }
        }

        System.out.println(count);


    }

    public static boolean isValid(int[] current, int[] list) {
        boolean check = true;
        for (int i = 0; i < 4; i++) {
            if (current[i] < list[i]) {
                check = false;
            }
        }
        return check;
    }

    public static void addChar(int[] current, char c) {
        if (c == 'A') {
            current[0] += 1;
        }
        if (c == 'C') {
            current[1] += 1;
        }
        if (c == 'G') {
            current[2] += 1;
        }
        if (c == 'T') {
            current[3] += 1;
        }
    }

    public static void removeChar(int[] current, char c) {
        if (c == 'A') {
            current[0] -= 1;
        }
        if (c == 'C') {
            current[1] -= 1;
        }
        if (c == 'G') {
            current[2] -= 1;
        }
        if (c == 'T') {
            current[3] -= 1;
        }
    }
}
