import java.io.IOException;
import java.util.HashSet;

class Solution {
    static Character[] temp;
    static HashSet<Integer> store;
    public int solution(String numbers) {
        int answer = 0;
        store = new HashSet<>();
        char[] nums = numbers.toCharArray();

        backTracking(nums, "", new boolean[nums.length]);

        for (int i : store) {
            boolean isOk = false;
            if (i < 2) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ( i % j == 0) {
                    isOk = true;
                }
            }
            if (!isOk) {
                answer ++;
            }
        }
        return answer;
    }

    public static void backTracking(char[] nums, String current, boolean[] used) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            store.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            backTracking(nums, current + nums[i], used);
            used[i] = false;
        }
    }

    public static void main(String args[]) throws IOException {
        Solution solution = new Solution();
        int answer = solution.solution("17");
        System.out.println(answer);
    }
}