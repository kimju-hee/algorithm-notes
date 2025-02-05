class 타겟넘버 {
    static int count = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, 0, target);
        return count;
    }

    public void dfs(int[] numbers, int idx, int number, int target) {
        if (idx == numbers.length) {
            if (number == target) {
                count += 1;
            }
            return;
        }

        dfs(numbers, idx + 1, number + numbers[idx], target);
        dfs(numbers, idx + 1, number - numbers[idx], target);
    }

    public static void main(String args[]) {
        타겟넘버 타겟 = new 타겟넘버();
        int[] input = new int[]{1, 1, 1, 1, 1};
        타겟.solution(input, 3);
    }
}