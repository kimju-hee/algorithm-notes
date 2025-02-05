import java.util.HashMap;
import java.util.HashSet;

class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
        }

        int temp = nums.length;
        int N = temp / 2;
        int number = map.size();

        if (number < N) {
            answer = number;
        } else {
            answer = N;
        }

        return answer;
    }

}