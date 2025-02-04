import java.util.Arrays;
import java.util.Comparator;

class 실패율 {
    public int[] solution(int N, int[] stages) {
        double[][] list = new double[N][2];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                list[stages[i]-1][0] += 1;
            }
        }

        int total = stages.length;

        for (int i = 0; i < N; i++) {
            if (total <= 0 || list[i][0] == 0) {
                list[i][0] = 0;
            } else {
                double temp = list[i][0];
                double cal = temp / total;
                total -= temp;
                list[i][0] = cal;
            }
            list[i][1] = i+1;
        }

        Arrays.sort(list, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o2[0] == o1[0]) {
                    return Double.compare(o1[1], o2[1]);
                } else {
                    return Double.compare(o2[0], o1[0]);
                }
            }
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) list[i][1];

            System.out.println(answer[i]);
        }

        return answer;
    }
    public static void main(String args[]) {
        실패율 실패 = new 실패율();
        int[] input = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        실패.solution(5, input);
    }
}