import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class 주식가격 {
    public int[] solution(int[] prices) {
        int[] number = new int[prices.length];
        for (int i = 0; i < number.length-1; i++) {
            number[i] = 0;
        }

        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                number[i] += 1;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return Arrays.stream(number).toArray();
    }

    public static void main(String args[]) {
        주식가격 a = new 주식가격();
        int[] input = new int[]{1, 2, 3, 2, 3};
        a.solution(input);
    }
}