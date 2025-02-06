class 정수삼각형 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int N = triangle.length;
        int max = 0;

        if (N == 1) {
            max = triangle[0][0];
        }

        if (N >= 2) {
            triangle[1][0] += triangle[0][0];
            triangle[1][1] += triangle[0][0];

            for (int i = 2; i < N; i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        triangle[i][j] += triangle[i - 1][j];
                    } else if (j == i) {
                        triangle[i][j] += triangle[i - 1][j - 1];
                    } else {
                        triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                    }

                }
            }

            for (int i = 0; i < N - 1; i++) {
                if (triangle[N - 1][i] > max) {
                    max = triangle[N - 1][i];
                }
            }

            System.out.println(max);

        }
        return max;
    }

    public static void main(String args[]) {
        정수삼각형 a = new 정수삼각형();
        int[][] input = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        a.solution(input);
    }
}